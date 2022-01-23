import java.util.*;
public class MaxiSubTree{
	public static class Node{
		int data;
		ArrayList <Node> children;
		Node(int data){
			this.data = data;
			children = new ArrayList <> ();
		}
	}
	public static Node getTree(int [] arr)
	{
		Stack <Node> stk = new Stack <>();
		Node root = null;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i] ==-1)
			{
				stk.pop();
			}
			else
			{
				Node newNode = new Node(arr[i]);
				if(root == null)
				{
					root = newNode;
				}
				else
				{
					Node parent = stk.peek();
					parent.children.add(newNode);
				}
				stk.push(newNode);
			}
		}
			return root ;
	}

		
	
	
	
	
		public static class pair{
			int data;
			int max;
			Node mssn;
			pair(){}
			pair(int data,int max,Node mssn){
				this.data = data;
				this.max = max;
				this.mssn = mssn;
			}

		}

		public static pair  maxsum(Node node){
			int data = node.data;
			int max = Integer.MIN_VALUE;
			Node mssn = null;
			for(int i =0;i<node.children.size();i++)
			{
				Node child = node.children.get(i);
				pair p = maxsum(child);
				data+=child.data;
				if(p.max>max)
				{
					max =p.max;
					mssn =p.mssn;
				}
			}
			if(data>max)
			{
				max =data;
				mssn = node;
			}
			return new  pair(data,max,mssn);
		}
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int [n];
		for(int i = 0;i<n;i++)
		{
			arr[i] = scn.nextInt();
		}
		Node root = getTree(arr);
		  pair ans =maxsum(root);
		  System.out.println(ans.mssn.data+"@"+ans.max);

	
	}
}
