import java.util.*;
public class Height {
	public static class Node{
		int data;
		ArrayList <Node> children;
		Node(){}
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
		return root;
	}
	public static  int height(Node node)
	{
			  int ht =-1;
			for(int i =0;i<node.children.size();i++)
			{
					  int nht = height(node.children.get(i));

				ht = Math.max(nht,ht);
			}
			return ht+1;
	}
	public static void main(String [] args)
	{
			  Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int [] arr = new int [n];
		for(int i =0;i<n;i++)
		{
			arr[i] = scn.nextInt();
		}
		Node root = getTree(arr);
			System.out.println(height(root));
	}
}
