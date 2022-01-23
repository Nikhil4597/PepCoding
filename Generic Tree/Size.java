import java.util.*;
public class Size{
	public static class Node{
		int data;
		ArrayList <Node> children;
	Node(){}
	Node(int data){
		this.data = data;
		children = new ArrayList <> ();
	}

	}
	public static Node getTree(int []arr)
	{
		Stack <Node> stk = new Stack <> ();
		Node root = null;
		for(int i =0;i<arr.length;i++){
			if(arr[i] ==-1)
			{
				stk.pop();

			}
			else
			{
					Node newNode = new Node(arr[i]);
					if(i==0)
					{	
						root = newNode;
					}
					else{
						Node parent = stk.peek();
						parent.children.add(newNode);
					}
				stk.push(newNode);
			}

		}
		return root;
	}
	public static int  getSize(Node node)
	{
			  int size=0;
		for(int i =0;i<node.children.size();i++)
		{
				 size+=getSize(node.children.get(i));
		}
		return size+1;
	}
	public static void main(String [] args)
	{
			Scanner scn  = new Scanner(System.in);
			int n = scn.nextInt();

		int [] arr = new int [n] ;
		for(int i =0;i<n;i++)
		{
			arr[i] =scn.nextInt();
		}
		Node root = getTree(arr);
		System.out.println(getSize(root));
	}

}
