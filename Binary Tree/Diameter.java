import java.util.*;
public class Diameter{
	public static class  Node {
		int data;
		Node right ;
		Node left;
		Node(int data){
			this.data = data;
		}
	}
	public  static class Pair{
		Node node;
		int st;
		Pair(Node node,int st)
		{
			this.node = node;
			this.st = st;
		}
	}
	public static Node getBTree(int [] arr)
	{
		Stack<Pair> stk = new Stack <>();
		Node root = new Node(arr[0]);
		stk.push(new Pair(root ,0));
		int i =1;
		while(stk.size()>0)
		{
			Pair top = stk.peek();
			if(top.st==0){
				if(arr[i] == -1){
					top.node.left = null;
				}
				else{
					Node nn = new Node(arr[i]);
					stk.push(new Pair(nn,0));
					top.node.left = nn;
				}
				i++;
				top.st++;
			}
		      


			else if(top.st ==1){
				if(arr[i] ==  -1)
				{
					top.node.right = null;
				}
				else{
					Node nn = new Node(arr[i]);
					stk.push(new Pair(nn,0));
					top.node.right = nn;
				}
				i++;
				top.st++;
			}

			else if(top.st ==2)
			{stk.pop();}
		}
		return root;
	}
	public static class Dpair{
		int ht ;
		int dia;
		Dpair(int ht ,int dia)
		{
			this.ht = ht ;
			this.dia = dia;
		}
	}
	public static int getDia(Node node)
	{
		Dp	air ans = helper(node);
		return ans.dia;


	}
	public static Dpair helper(Node node)
	{
		if(node == null)
		{
			return new Dpair(-1,0);
		}
		Dpair ln = helper(node.left);
		Dpair rn = helper(node.right );
		int ht  = Math.max(ln.ht,rn.ht)+1;
		int cdia = ln.ht+rn.ht +2;
		int dia  = Math.max(Math.max(ln.dia,rn.dia),cdia);
		return new Dpair(ht,dia);
	}

	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int [n];
		for(int i =0;i<n;i++){
			arr[i] = scn.nextInt();
		}
		Node root = getBTree(arr);
		int dia = getDia(root);
		System.out.println(dia);
	}
}

