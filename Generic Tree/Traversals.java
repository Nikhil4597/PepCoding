import java.util.*;
public class Traversals{
	public static class Node{
		int data;
		ArrayList <Node> children;
		Node(int data){
			this.data = data;
			children = new ArrayList <>();
		}
	}
	public static  Node getTree(int [] arr)
	{
		Stack <Node> stk = new Stack <> ();
		Node root = null;

		for(int i =0;i<arr.length;i++)
		{
				if(arr[i] == -1)
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
	public static void traversal(Node node){
		System.out.println("Node Pre"+node.data);
		for(int i =0;i<node.children.size();i++)
		{
				  System.out.println("Edge Pre"+node.data+"--"+node.children.get(i).data);
			traversal(node.children.get(i));
			System.out.println("Edge Post"+node.data+"--"+node.children.get(i).data);
		}
		System.out.println("Node Post"+node.data);

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
		traversal(root);
	}
}
