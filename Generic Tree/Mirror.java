import java.util.*;
public class Mirror{
  public static class Node{
    int data;
    ArrayList <Node> children;
    Node(int data)
    {
	    this.data = data;
	    children=  new ArrayList <> ();

      }
  }
  public static Node getTree(int [] arr)
  {
    Stack <Node> stk = new Stack <>();
    Node root = null;
    for(int i =0;i<arr.length;i++)
    {
      if(arr[i] ==-1)
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
	  else{
	      Node parent = stk.peek();
	      parent.children.add(newNode);
	  }
	  stk.push(newNode);
      }
    }
    return root;
  }
  public static void  show(Node node)
  {
	System.out.print(node.data+"->");

	for(int i =0;i<node.children.size();i++)
	{
		Node child = node.children.get(i);

	  System.out.print(child.data+" ");
	}
	System.out.println(".");
	for(int i =0;i<node.children.size();i++)
	{
	    Node child = node.children.get(i);
	    show(child);    
	  }
    }
  public static void mirrorTree(Node node)
  {
	  for(int i =0;i<node.children.size();i++)
	  {
	      Node child = node.children.get(i);
	      mirrorTree(child);
	  }
	 int l =0;
	 int r=  node.children.size()-1;
	 while(l<r)
	 {
		 Node ln = node.children.get(l);
		 Node rn = node.children.get(r);
		 node.children.set(l,rn);
		 node.children.set(r,ln);
	    l++;
	    r--;
	 }
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
    mirrorTree(root);
    show(root);
    //mirror(root);
  }
}
