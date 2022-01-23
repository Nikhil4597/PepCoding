import java.util.*;
public class ShowBT{
	public static class  Node{
		int data;
		Node right;
		Node left;
		Node(int data)
		{
			this.data = data;
		}
	}
	public static class Pair{
		Node node;
		int state;
		Pair(Node node,int state)
		{
			this.node = node;
			this.state = state;
		}
	}
	public static Node getBTree(int [] arr)
	{
		Stack <Pair> stk = new Stack <>();
		Node root = new Node(arr[0]);
		int i =1;
		stk.push(new Pair(root,0));
		     while(stk.size()>0)
		     {
			    Pair np = stk.peek();
			    Node node = np.node;
			    int state = np.state;
			    if(state ==0)
			    {
				    if(arr[i]==-1)
				    {
					    node.left = null;
					    np.state++;
				    }
				    else
				    {
					    Node nn = new Node(arr[i]);
					    Pair cp = new Pair(nn,0);
					    stk.push(cp);
					    node.left  =nn;
					       np.state++;
				    }
				    i++;
			    }

				  
			    else if(state ==1)
			    {
				    if(arr[i]==-1)
				    {
					    node.right = null;
					    np.state++;

				    }
				    else{
					    Node  nn = new Node(arr[i]);
					    Pair cp = new Pair(nn,0);
					    stk.push(cp);
					    node.right = nn;
					    np.state++;
				    }
				  i++;     

			    }
			    else if(state ==2)
			    {

				    stk.pop();
			    }
			    
		     }
		     return root;
	}


	public static void show(Node node){
	  if(node == null){
		  return ;
	  }
	  String md = "<-"+node.data+"->";
	  String ld = (node.left == null)?".":node.left.data+"";
	  String rd = (node.right == null)?".":node.right.data+"";
	  System.out.println(ld+md+rd);

		show(node.left);
	  show(node.right);
	}

		
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int [n];
		for(int i =0;i<n;i++){
			arr[i] = scn.nextInt();
		}
		Node root = getBTree(arr);
		show(root);
	}
}
