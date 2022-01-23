import java.util.*;
public class KDisAway {
    public static class Node{
        int data;
        Node right ;
        Node left;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static class Pair{
        int st;
        Node node;
        Pair(Node node ,int st){
            this.node = node;
            this.st = st;
        }
    }
    public static Node getBTree(int [] arr){
	    Stack <Pair> stk = new Stack <>();
		    Node root  = new Node (arr[0]);
	    stk.push(new Pair(root,0));
	    int i =1;
	    while(stk.size()>0)
	    {
		    Pair top = stk.peek();
		    if(top.st==0){
			    //left work
			    if(arr[i]==-1)
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
			    //right work
			    if(arr[i]== -1)
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
		    else  if(top.st ==2)
		    {
			    stk.pop();
		    }
	    }
	    return root;
    }
    public  static ArrayList <Node> getNodeToRootPath(Node node,int data)
    {
	    if(node == null)
	    {
		    return new ArrayList <Node>();
	    }
	  if(node.data ==  data)
	  {
		  ArrayList <Node> ans = new ArrayList <>();
		  ans.add(node);
		  return  ans;
	  }
	  ArrayList <Node> lans = getNodeToRootPath(node.left,data);
	  if(lans.size()>0)
	  {
		  lans.add(node);
		  return lans;	
	  }
	  ArrayList <Node> rans = getNodeToRootPath(node.right,data);
	  if(rans.size()>0)
	  {
		   rans.add(node);
		   return rans;
	  }
	  
	  return new ArrayList<Node>();
    }

	 	  
    public static void kDisDown(Node node ,int k,Node pro)
    {
	    if(node == null || node == pro)
	    {
		    return ;
	    }
	    if(k == 0)
	    {
	
		    System.out.println(node.data);
	    }
	    kDisDown(node.left,k-1,pro);
	    kDisDown(node.right,k-1,pro);
    }
    public static void nodeToKDis(Node node,int data,int d)
    {
	    ArrayList <Node> path = getNodeToRootPath(node,data);
		Node pro  =null;
		System.out.println(path);
	    for(int i =0;i<path.size();i++)
	    { 
		    Node temp = path.get(i);
		    kDisDown(temp,d-i,pro);
			pro = path.get(i);
	    }
    }
	 
    public static void main(String [] args)
    {
        Scanner scn= new Scanner(System.in);
        int n  = scn.nextInt();
        int [] arr =new int [n];
        for(int i =0;i<n;i++)
        {
            arr[i] = scn.nextInt();

        }
        Node root = getBTree(arr);
	int data = scn.nextInt();
	int dis = scn.nextInt();
	nodeToKDis(root,data,dis);
    }
}
