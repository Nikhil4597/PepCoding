import java.util.*;
public class NodeDistance{
	public static class Node{
		int data;
		ArrayList <Node> children;
		Node(int data){
			this.data = data;
			children = new ArrayList <>();
		}
	}
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int [n];
		for(int i =0 ;i<n;i++)
		{
			arr[i]= scn.nextInt();
		}
		Node root = getTree(arr);
		int data1 = scn.nextInt();
		int data2 = scn.nextInt();

		int dis = getDistance(root ,data1,data2);
		System.out.println(dis);
	}
	public static Node getTree(int [] arr)
	{
		Stack <Node> stk = new Stack<>();
		Node root = null;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]== -1)
			{
				stk.pop();
			}

			else
			{
				Node newNode  = new Node(arr[i]);
				if(root == null)
				{
					root= newNode;
				}
				else
				{
					Node parent = stk.peek();
					parent.children.add(newNode);
				}
				stk.push(newNode);
			}
		}
		return root;
	}
	public static int getDistance(Node node ,int d1,int d2)
	{
	      ArrayList <Integer> path1 = nodeToRootPath(node,d1);

	      ArrayList <Integer> path2 = nodeToRootPath(node,d2);
	      int i  = path1.size()-1;
	      int j = path2.size()-1;

		      while(i>=0 && j>=0)
		      {
			      if(path1.get(i) == path2.get(j))
			      {
				      i--;
				      j--;
				    }
			      else{
				      return i+j+2;
			      }
		      }
	      return i+j+2;
	}

	public static ArrayList <Integer> nodeToRootPath(Node node,int data)
	{
		 if(node.data == data)
		 {
			 ArrayList <Integer> ans = new ArrayList<>();
			 ans.add(data);
			 return ans;
		 }
		 for(int i =0;i<node.children.size();i++)
		 {
			Node child = node.children.get(i);
			ArrayList <Integer> ans = nodeToRootPath(child,data);
			if(ans.size()>0)
			{
				ans.add(node.data);
				return ans;
			}
		 }
		 return  new ArrayList <Integer> ();

	}
}

