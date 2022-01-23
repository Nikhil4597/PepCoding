import java.util.*;
public class FindData{
  public static class Node{
    int data;
    ArrayList <Node> children;
    Node(int data)
    {
	    this.data = data;
	    children = new ArrayList <> ();

    }
  } 
  public static Node  getTree(int [] arr)
  { 
	  Node root  = null;
	  Stack <Node> stk = new Stack <>();
	  for(int i =0;i<arr.length;i++)
	  {
		  if(arr[i]==-1)
		  {
			  stk.pop();

		  }
		  else
		  {

			  Node newNode = new Node(arr[i]);
			  if(root ==null)
			  {
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
  public static boolean find(Node node,int data)
  {
	 if(node.data == data)
	 {
		 return true;
	 }
	 boolean ans = false;
	 for(int i =0;i<node.children.size();i++)
	 {
		 Node child = node.children.get(i);
		 ans = find(child,data);
		 if(ans == true)
			 return true;

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
	  int data = scn.nextInt();
	  Node root = getTree(arr);
	  System.out.println(find(root,data));
	  
  }
}
