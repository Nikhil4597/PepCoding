import java.util.*;
public class kLvlShow{
	public static class Node{
		int data;
		Node right;
		Node left;
		Node(int data){
			this.data = data;
		}
	}
	public static class Pair{
		Node node;
		int st;
		Pair(Node node,int st)
		{
			this.node = node;
			this.st = st;
		}
	}
	public static Node getBTree(int [] arr){
		Stack<Pair> stk = new Stack<>();
		Node root = new Node(arr[0]);
		stk.push(new Pair(root,0));
		int i =1;
		while(stk.size()>0)
		{
			Pair top = stk.peek();

			if(top.st ==0)
			{
				if(arr[i] == -1)
				{
					top.node.left =null;
				}
				else
				{
					Node nn = new Node(arr[i]);
					stk.push(new Pair(nn,0));
					top.node.left =nn;
				}
				i++;
				top.st++;
			}
			else if(top.st ==1)
			{
				if(arr[i] == -1)
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
			{
				stk.pop();
			}
		}
		return root ;
	}

	public static void kLvl(Node node,int lvl){
	      ArrayDeque <Node> deq = new ArrayDeque<>();
	      deq.add(node);

		int k =0;
	    
		  while(deq.size()>0)
		  {
			  if(lvl == k)
			  {
				  break;
			  }
			  int size = deq.size();
			  for(int i=0;i<size;i++)
			  {
			    Node rm = deq.remove();
			    if(rm.left != null)
			   {
					  deq.add(rm.left);
			   }
			    if(rm.right!= null)
			    {
					  deq.add(rm.right);
			     }
			  }
			  
			  k++;
		  }
		  while(deq.size()>0)
		  {
			  Node temp = deq.remove();
			  System.out.println(temp.data);
		  }
	}


			 






	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int []arr = new int [n];
		for(int i =0;i<n;i++)
		{
			arr[i] = scn.nextInt();
		}
		Node root = getBTree(arr);
		int lvl = scn.nextInt();
		kLvl(root,lvl);
	}
}

