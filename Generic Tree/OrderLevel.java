import java.util.*;
public class OrderLevel{
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
	public static void orderLevel(Node node)
	{
		ArrayDeque <Node> lt = new ArrayDeque <>();
		lt.add(node);// add first node in queue
		while(lt.size()>0)
		{
			//remove form queue
			Node rem = lt.remove();
			//working area 
			System.out.print(rem.data+" ");
			//move to next sub Node
			for(int i =0;i<rem.children.size();i++)
			{
				lt.add(rem.children.get(i));
			}
		}
		System.out.println(".");

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
		orderLevel(root);
	
	}
}
