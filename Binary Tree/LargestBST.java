import java.util.*;
public class LargestBST{
	public static class Node{
		int data;
		Node right ;
		Node left;
		Node(int data){
			this.data = data;
		}
	}
	public static class Bpair{
		Node node;
		 int st;
		 Bpair(Node node,int st)
		 {
			 this.node = node;
			 this.st = st;
		 }
	}



	public static Node getBTree(int [] arr)
	{
		Stack <Bpair> stk = new Stack<>();
		Node root = new Node(arr[0]);
		stk.push(new Bpair(root ,0));
		int i =1;
		while(stk.size()>0)
		{
			Bpair top = stk.peek();

			if(top.st ==0)
			{
				if(arr[i]==-1)
				{
				      top.node.left = null;
				}
				else {
					Node nn = new Node(arr[i]);
					stk.push(new Bpair(nn,0));
					top.node.left = nn;
				}
				i++;
				top.st++;
			}
			else if(top.st ==1)
			{
				if(arr[i] == -1)
				{
					top.node.right =null;
				}
				else{
					Node nn = new Node(arr[i]);
					stk.push(new Bpair(nn,0));
					top.node.right = nn;
				}
				top.st++;
				i++;
			}

			else if(top.st == 2)
			{
				stk.pop();
			}
		}
		return root ;
	}
	public static class Pair{
		int max;
		int min;
		Node nd;
			//node data
		int size;
		boolean ans;
		Pair(int max,int min,boolean ans,Node nd ,int size)
		{
			this.max = max;
			this.min = min;
			this.ans = ans;
			this.nd = nd;
			this.size = size;
		}

	}

			
	public static Pair largestBST(Node node)
	{
		if(node == null)
		  {
			  return new Pair(Integer.MIN_VALUE,Integer.MAX_VALUE,true,null,0);
		  }
		Pair ln =largestBST(node.left);
		Pair rn = largestBST(node.right);
		int max = Math.max(node.data,Math.max(ln.max,rn.max));
		 int min = Math.min(node.data,Math.min(ln.min,rn.min));
		  boolean  ans = (ln.ans == true) &&(rn.ans == true) &&(ln.max<node.data) &&(node.data<rn.min);
		  Node nd =null;
		  int size =0;

		  if(ans == true)
		  {
			nd = node;
			size = rn.size+ln.size+1;
		  }
		  else{
			  if(ln.size<rn.size)
			  {
				  nd = ln.nd ;
				  size = ln.size;
			  }
			  else{
				  nd = rn.nd;
				  size = rn.size;
			  }
		  }

		  return  new Pair(max,min,ans,nd,size);

	      
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
		Pair ans = largestBST(root);

		System.out.println(ans.nd.data +"@"+ans.size);
	}
}



