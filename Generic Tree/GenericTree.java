import java.util.*;
public class GenericTree{
	public static class Node{
		int data;
		ArrayList <Node> children;
		Node(){}
		Node(int data)
		{
			this.data = data;
			children = new ArrayList <>();

		}
	}
	public static Node getTree(int [] arr)
	{
		Stack <Node> stk = new Stack <> ();
		Node root = null;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==-1)
			{
				stk.pop();
			}
			else{
				Node newNode = new Node(arr[i]);
				if(i ==0)
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
	public static void show(Node node)
	{
		System.out.print(node.data+"->");
		for(int i =0;i<node.children.size();i++)
		{
			System.out.print(node.children.get(i).data+" ,");
		}
		System.out.println(" .");
		for(int i =0;i<node.children.size();i++)
		{
			show(node.children.get(i));
		}
	}
	public static void main(String [] args){
		int  [] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,90,-1,110,-1,-1,-1,40,100,-1,-1,-1};
		Node root = getTree(arr);
		show(root);
	 }
}
