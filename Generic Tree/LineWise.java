import java.util.*;
public class LineWise{
	public static class Node{
		int data;
		ArrayList <Node> children;
		Node(int data){
			this.data = data;
			children = new ArrayList<>();

		}
	} 
	public static Node getTree(int [] arr)
	{
		Node root = null;
		Stack <Node> stk = new Stack <> ();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==-1)
			{
				stk.pop();

			}
			else
			{
				Node newNode = new Node (arr[i]);
				if(root == null)
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
	public static void lineWise(Node node)
	{
		ArrayDeque <Node> pque = new ArrayDeque <>();
		ArrayDeque <Node> cque = new ArrayDeque <>();
		pque.add(node);
		while(pque.size()>0)
		{
			Node rm = pque.remove();
			System.out.print(rm.data+" ");
			for(int i=0;i<rm.children.size();i++)
			{
				Node child = rm.children.get(i);
				cque.add(child);
			}
			if(pque.size()==0)
			{
				System.out.println();
				pque = cque;
				cque = new ArrayDeque<> ();
		}
		}

	}
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new  int [n];
		for(int i =0;i<n;i++)
		{
			arr[i] = scn.nextInt();

		}
		Node root = getTree(arr);
		 lineWise(root);
	}
}
