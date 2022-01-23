import java.util.*;
public class PathtoLeaffromRootInRange{
	public static class Node{
		int data;
		Node right;
		Node left;
		Node(int data){
			this.data = data;
		}
	}
	public static class Pair{
		int st;
		Node node;
		Pair(Node node,int st)
		{
			this.node = node;
			this.st =st;
		}
	}

	public static Node getBTree(int [] arr)
	{
		Stack <Pair> stk = new Stack <Pair>();
		Node root = new Node(arr[0]);
		stk.push(new Pair(root,0));
		int i =1;
		while(stk.size()>0)
		{
			Pair top = stk.peek();
			if(top.st == 0)
			{
				if(arr[i] ==-1)
				{
					top.node.left = null;
				}
				else
				{
					Node nn = new Node(arr[i]);
					stk.push(new Pair(nn,0));
					top.node.left = nn;
				}
				i++;
				top.st++;
			}
			else if(top.st == 1)
			{
				if(arr[i]==-1)
				{
					top.node.right = null;
				}
				else
				{
					Node nn = new Node(arr[i]);
					stk.push(new Pair(nn,0));
					top.node.right =nn;
				}
				i++;
				top.st++;
			}
			else if(top.st ==2)
			{ stk.pop();}
		}
		return root;
	}
	public static  void getPath(Node node,String str,int sum,int lo,int hi)
		{
			if(node == null)
			{
				return ;
			}
			if(node.right == null && node.left == null)
			{
				str+=node.data+" ";
				sum+=node.data;
				if(lo<= sum && hi>=sum)
				{
					System.out.println(str);
				}
				return ;
			}
			getPath(node.left,str+node.data+" ",sum+node.data,lo,hi);
			getPath(node.right,str+node.data+" ",sum+node.data,lo,hi);
		
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
		Node root = getBTree(arr);
		int lo = scn.nextInt();
		int hi = scn.nextInt();
		getPath(root,"",0,lo,hi);


	}
}
