import java.util.*;
public class CloneTree {

    public static class Node{
        int data;
        Node right ;
        Node left;
        Node(int data)
        {
            this .data = data;

        }
    }
    public static class Pair{
        int st;
        Node node;
        Pair(Node node ,int st)
        {
            this.st = st;
            this.node = node;
        }
    }
    public static Node getBTree(int []arr)
    {
        Stack <Pair> stk = new Stack<>();
        Node root = new Node (arr[0]);
        stk.push(new Pair(root ,0));
        int i =1;
        while(stk.size()>0)
        {
            Pair top = stk.peek();
            if(top.st ==0)
            {
                //left
                if(arr[i]== -1)
                {
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
            else if(top.st ==1)
            {
                //right
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
            else if(top.st == 2){
                //post work
                stk.pop();

            }
            
        }
        return  root;
    }
    public static void show(Node node)
    {
        if(node == null)
        {
            return;
        }
        int lval = node.left == null?Integer.MIN_VALUE:node.left.data;
        int rval = node.right == null?Integer.MIN_VALUE:node.right.data;
        System.out.println(lval+"<-"+node.data+"->"+rval);
        show(node.left);
        show(node.right);
    }
    public static Node clone(Node node)
    {
        if(node == null)
        {
            return null;
        }
        Node rn = clone(node.right);
        Node ln = clone(node.left);
        node.right = rn;
        Node nn = new Node(node.data);
        node.left = nn;
        nn.left = ln;
        return node;
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int  [] arr = new int [n];
        for(int i =0;i<n;i++)
        {
            arr[i] = scn.nextInt();

        }
        Node root = getBTree(arr);
        show(root);
        System.out.println();
        Node newRoot = clone(root); 
        show(root);
    }
}