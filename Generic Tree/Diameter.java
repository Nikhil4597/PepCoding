import java.util.*;
public class Diameter{
	public static class  Node{
		int data;
		ArrayList <Node> children;
		Node(int data){
			this.data = data;
			children = new ArrayList <>();
		}

	}
	public static Node getTree(int [] arr){
		Stack <Node> stk = new Stack <>();
		Node root =  null;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i] == -1)
			{
				stk.pop();
			}
			else
			{
			      Node newNode = new Node(arr[i]);
			      if(root == null){
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
	public static class Pair{
		int dia;
		int h1;
		int h2;
		Pair(int dia,int h1,int h2)
		{
			this.dia = dia ;
			this.h1 = h1;
			this.h2 = h2;
		}
	}
	public static Pair getDia(Node node)
	{
		int dia =0;int h1 =-1;int h2 = -1;
		for(int i =0;i<node.children.size();i++)
		{
		      Node child = node.children.get(i);
		      Pair ca = getDia(child);

		      if(ca.h1>h1)
		      {
			      h1 = ca.h1;
			      h2 = h1;
		      }
		      if(ca.h2>h2){
			      h2 = ca.h2;
		      }
		      if(dia<ca.dia)
		      {
			      dia = ca.dia;
		      }
		}
		return new Pair(dia,h1,h2);
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
		Pair ans =	getDia(root);
		System.out.println(ans.dia);
	}
}
