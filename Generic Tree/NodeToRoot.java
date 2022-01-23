import java.util.*;
public class NodeToRoot{
	public static class Node{
		int data;// Node data

		ArrayList <Node> children;//node ke bacche
		Node(int data){
			this.data = data;
	  		children = new ArrayList<>();//assign children =0
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
				Node newNode=  new Node(arr[i]);
				if(root==null)
				{
					root =newNode;
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
	public static ArrayList<Integer> getPath(Node node,int data)
	{
		if(node.data == data)
		{
			ArrayList <Integer> ans = new ArrayList <>();
			ans.add(node.data);
			return ans;
		}
		for(int i =0;i<node.children.size();i++)
		{
			Node child = node.children.get(i);
			ArrayList <Integer>ans = getPath(child,data);
			if(ans.size()>0)
			{
				ans.add(node.data);
				return ans;

			}
		}
		return new ArrayList<Integer>();
	}
	public static  void main(String [] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int [n];
		for(int i =0;i<n;i++)
		{
			arr[i] = scn.nextInt();
		}
		Node root = getTree(arr);
		int data = scn.nextInt();
		ArrayList <Integer> path = getPath(root,data);
		System.out.println(path);


}
}
