import java.util.*;
public class SimilarTrees{
	public static class Node{
		int  data;
		ArrayList <Node> children;
		Node(int data){
			this.data = data;
			children = new ArrayList<>();

	}
	}
	public static Node getTree(int [] arr)
	{
		Stack <Node> stk = new Stack<> ();
		Node root = null;
		for(int i =0;i<arr.length;i++){
			if(arr[i]==-1)
			{
				stk.pop();
			}
			else
			{
				Node newNode = new Node(arr[i]);
				if(root == null){
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
	public static boolean isSimilar( Node node1,Node  node2)
	{
		if(node1.children.size()!=node2.children.size())
		{
			return false;
		}
		for(int i =0;i<node1.children.size();i++)
		{
			if(isSimilar(node1.children.get(i),node2.children.get(i))==false)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int [] arr1 = new int [n1];
		for(int i =0;i<n1;i++){
			arr1[i] = scn.nextInt();
		}
		Node root1 = getTree(arr1);
		int n2 = scn.nextInt();
		int [] arr2 = new int [n2];
		for(int i =0;i<n2;i++){
			arr2[i] = scn.nextInt();
		}
		Node root2 = getTree(arr2);
		boolean ans = isSimilar(root1,root2);
		System.out.println(ans);
	}
}





