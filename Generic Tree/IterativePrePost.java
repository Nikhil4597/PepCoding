import java.util.*;
public class IterativePrePost{
	public static class Node{
		int data;
		ArrayList <Node> children;
		Node(int data){
			this.data = data;
		  children = new ArrayList <>();

		}

	}
	public static Node getTree(int [] arr)
	{
		Stack <Node> stk  = new Stack <>();
		Node root = null;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==-1)
			{
				stk.pop();
			}
			else
			{
				Node newNode = new Node (arr[i]);
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
		return root ;
	}
	public static class Pair{
		Node node;
		int state;
		Pair(Node node,int state){
			this.node  = node;
			this.state = state;
		}
	}

	public static void getPrePost(Node node){
		String pre = "";
	      String post = "";
		Stack <Pair> stk = new Stack<> ();
		Pair np = new Pair(node,-1);
		stk.push(np);

		while(stk.size()>0)
		{
			Pair top = stk.peek();
			int st = top.state;
			if(st == -1)
			{
				pre+=top.node.data+" ";
				top.state++;
			}
			else if(st >=0 && st<top.node.children.size()){
				stk.push(new Pair(node.children.get(st),-1));

				top.state++;
			}
			else if(st == top.node.children.size())
			{
				post+= top.node.children.get(st)+" ";
				stk.pop();
			}
		}
		System.out.println(pre);
		System.out.println(post);
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
		getPrePost(root);
	}
			
}
