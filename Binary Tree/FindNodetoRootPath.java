import java.util.*;
public class FindNodetoRootPath{
	public static class Node{
		int data;
		Node rgt;
		Node lft;
		Node(int data)
		{
			this.data = data;
		}
	}
	public static class Pair{
		int st;
		Node node;
		Pair(Node node,int st){
			this.node = node;
			this.st = st;
		}
	}
	public static Node  getBTree(int [] arr){
		Stack <Pair> stk = new Stack <>();
		Node root = new Node(arr[0]);
		stk.push(new Pair(root,0));
		int i =1;
		while(stk.size()>0)
		{
			Pair top = stk.peek();
			if(top.st == 0){
				if(arr[i]==-1)
				{
					top.node.lft = null;
				}
				else
				{
				      Node nn = new Node(arr[i]);
				      top.node.lft = nn;
				      stk.push(new Pair(nn,0));
				}
				top.st++;
				i++;
			}
			else if(top.st == 1)
			{
				if(arr[i] == -1)
				{
					top.node.rgt = null;
				}
				else
				{
					Node nn = new Node(arr[i]);
					stk.push(new Pair(nn,0));
					top.node.rgt = nn;
				}
				top.st++;
				i++;
			}
			else if(top.st == 2)
			{
				stk.pop();
			}
		}
		return root;
	}


	public static boolean isHere(Node node,int data)
	{
		if(node == null)
		{
			return false;
		}

		if(node.data == data)
		{
			return true;
		}
		boolean lf = isHere(node.lft,data);
		if(lf == true)
		{
			return true;
		}
		boolean rf = isHere(node.rgt,data);
		if(rf == true)
		{
			return true;
		}
		return false;
	}
	public static ArrayList<Integer> getNtoRP(Node node,int data)
	{
		if(node ==null)
		{
			return new ArrayList<Integer>();
		}
		if(node.data == data)
		{
			ArrayList <Integer> ans = new ArrayList <>();
			ans.add(data);
			return ans;
		}
		ArrayList <Integer> lsn = getNtoRP(node.lft,data);
		if(lsn.size()>0)
		{
			lsn.add(node.data);
			return lsn;
		}
		ArrayList <Integer> rsn = getNtoRP(node.rgt,data);

		if(rsn.size()>0)
		{
			rsn.add(node.data);
			return rsn;
		}
		return new ArrayList <Integer> ();
	}

	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr  = new int [n];
		for(int i =0;i<n;i++)
		{
			arr[i] = scn.nextInt();
		}
		Node root = getBTree(arr);
		int data = scn.nextInt();
		System.out.println(isHere(root,data));
		ArrayList <Integer> ans = getNtoRP(root,data);
		System.out.println(ans);
	}
}

