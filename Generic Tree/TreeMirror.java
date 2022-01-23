import java.util.*;
public class TreeMirror{
	public static class Node{
		int data;
		ArrayList <Node> children;
		Node(int data){
			this.data = data;
			children = new ArrayList <>();
		}
	}
	public static Node getTree(int [] arr)
	{
		Stack <Node>stk = new Stack<>();
		Node root = null;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]== -1)
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
	public static boolean isMirror(Node n1,Node n2)
	{
		if(n1.children.size()!=n2.children.size())
		{
			return false;
		}
		for(int i =0;i<n1.children.size();i++)
		{
			Node c1 = n1.children.get(i);
			Node c2 = n2.children.get(n2.children.size()-i-1);
			if(isMirror(c1,c2)== false)
			{
				return  false;
			}
		}
		return true;
	}

	public static boolean dataCompare(Node n1,Node n2)
	{
		if(n1.data !=n2.data)
		{
			return false;
		}
		for(int i =0;i<n1.children.size();i++)
		{
			Node c1 = n1.children.get(i);
			Node c2 = n2.children.get(i);
			if(dataCompare(n1,n2)==false)
			{
				return false;
			}
		}
		return true;
	}


	public static boolean isSimilar(Node n1,Node n2)
	{
		if(n1.children.size() != n2.children.size())
		{
			return false;
		}
		for(int i =0;i<n1.children.size();i++)
		{
			Node c1 = n1.children.get(i);
			Node c2 = n2.children.get(i);
			
			if(isSimilar(c1,c2)==false)
			{
				return false;
			}
		}
		return true;
	}



	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int [] arr1 = new int [n1];
		for(int i =0;i<n1;i++){
			arr1[i] = scn.nextInt();
		}
		Node r1 = getTree(arr1);
		int n2 = scn.nextInt();

		int [] arr2 = new int [n2];
		for(int i =0;i<n2;i++)
		{
			arr2[i] = scn.nextInt();
		}
		Node r2 = getTree(arr2);
		boolean ans = isMirror(r1,r2);
		System.out.println(ans);
	}
}

