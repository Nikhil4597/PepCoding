import java.util.*;
public class BasicBST{
	public static class Node{
		int data;
		Node right;
		Node left;
		Node(int data)
		{
			this.data = data;
		}
	}
	public static class Pair{
		 int st;
		 Node node;
		 Pair(Node node,int st)
		 {
			 this.node = node;
			 this.st = st;
		 }
	}
	public static Node getBST(int [] arr)
	{
		Stack <Pair> stk = new Stack<>();
		 Node root = new Node(arr[0]);
		 stk.push(new Pair(root,0));
		 int i =1;
		 while(stk.size()>0)
		 {
			 Pair top = stk.peek();

			 if(top.st ==0){
				 if(arr[i]==-1){
					 top.node.left =null;
			       
				 }
			  else{
				  Node nn = new Node(arr[i]);
				  top.node.left = nn;
				  stk.push(new Pair(nn,0));
			  }
			  top.st++;
			  i++;	 
			 } 
			 else if(top.st == 1)
			 {
				if(arr[i]==-1){
					top.node.right = null;

				}
				else{

					Node nn = new Node(arr[i]);
					top.node.right = nn;
					stk.push(new Pair(nn,0));

				}
				top.st++;
				i++;
		       	}
			else if(top.st ==2)
			{
				stk.pop();
			}
		 }
		 return root;
	}
	public static int size(Node node)
	{
		if(node == null)
		{
			return 0;
		}
		int lsize =0;
		int rsize =0;
		if(node.left != null)
		{
			lsize = size(node.left);
		}
		if(node.right !=null)
		{
			rsize = size(node.right);
		}
		return rsize+lsize+1;
	}
	public static int sum(Node node)
	{
		if(node == null)
		{
			return 0;
		}
		int lsum =0;
		int rsum =0;
		if(node.left!=null)
		{
			lsum = sum(node.left);
		}
		if(node.right!=null)
		{
			rsum = sum(node.right);

		}
		return node.data + rsum+lsum;
	}
	public static int max(Node node)
	{
		int ans =Integer.MIN_VALUE;
		if(node.right!=null)
		{
			ans = max(node.right);
		}
		else{
			ans = node.data;
		}
		return ans;
	}
	public static int min(Node node)
	{
		int ans = Integer.MAX_VALUE;
		if(node.left != null)
		{
			ans = min(node.left);
		}
		else{
			ans = node.data;
		}
		return ans;
	}
	public static boolean find(Node node ,int k)
	{
		if(node == null)
		{
			return false;
		}
		boolean ans= false;
		if(node.data>k)
		{
			ans =find(node.left, k);
		}
		else if(node.data<k)
		{
			ans = find(node.right ,k);

		}
		else{
			ans = true;
		}
		return ans;
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
		Node root = getBST(arr);
		System.out.println(size(root));
		System.out.println(sum(root));
		System.out.println(max(root));
		System.out.println(min(root));
		int k = scn.nextInt();
		System.out.println(find(root,k));
	}
}
