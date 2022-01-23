import java.util.*;
public class TreeNormalize{
	public static class Node{
		int data;
		ArrayList <Node> children;
 		Node(int data){
			this.data = data;
			children = new ArrayList <>();
		}
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
	//	treeNormalize(root);
		// Node newRoot = improvedLinear(root);

		show(root);
		System.out.println("After transformation");
		Node tail = improvedLinear(root);
		show(root);
		//show(newRoot);

	}
	public static Node getTree(int [] arr){
		Stack <Node> stk = new Stack <>();
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
		return root ;
	}
	public static void show(Node node){
		System.out.print(node.data+"-->");
		for(int i =0;i<node.children.size();i++)
		{
			Node child = node.children.get(i);
			System.out.print(child.data+"-->");
		}
		System.out.println(".");
		for(int i =0;i<node.children.size();i++)
		{ 
			Node child = node.children.get(i);

			show(child);
		}
	}
	public static void treeNormalize(Node node){

		for(int i =0;i<node.children.size();i++)
		{
			Node child = node.children.get(i);
			treeNormalize(child);
		}

		while(node.children.size()>1){
			int size = node.children.size();
			Node ln = node.children.get(size-1);
			Node sln = node.children.get(size-2);
			Node tail = getTail(sln);
			node.children.remove(ln);
			tail.children.add(ln);
		}

	}
	public static Node getTail(Node node){
		if(node.children.size()==0)
		{
			return node;
		}
		Node tail = null;
		for(int i =0;i<node.children.size();i++){
			Node child = node.children.get(i);
			tail = getTail(child);
		}
		return tail;
	}
	public static Node improvedLinear(Node node){
		if(node.children.size()==0)
		{
			return node;
		}

		Node ln = node.children.get(node.children.size()-1);
		Node tail = improvedLinear(ln);
		while(node.children.size()>1)
		{
		    int	size = node.children.size();
			Node sln = node.children.get(size-2);
			Node slnt = improvedLinear(sln);
			node.children.remove(size-1);
			slnt.children.add(ln);
			ln = sln;
		}
		return tail;
	}
}










