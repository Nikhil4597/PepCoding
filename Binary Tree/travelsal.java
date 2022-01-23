import java.util.*;
public class travelsal {
    public static class Node {
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
        int st;
        Pair(Node node ,int st)
        {
            this.node = node;
            this.st = st;
        }

    }
    public static Node getBTree(int  [] arr)
    {
        Stack <Pair> stk  = new Stack<>();
        Node root=  new Node(arr[0]);
        stk.push(new Pair(root,0));
        int i =1;
        while(stk.size()>0)
        {
            Pair top = stk.peek();
            if( top.st == 0)
            {
                //left
                if(arr[i] ==-1)
                {
                    top.node.left =null;
                }
                else{
                    Node nn = new Node (arr[i]);
                    Pair cp = new Pair( nn,0);
                    stk.push(cp);
                    top.node.left = nn;
                }
                i++;
                top.st++;
            }
            else if(top.st ==1)
            {
                //right
                if(arr[i] ==-1)
                {
                    top.node.right = null;
                }
                else{
                    Node nn = new Node(arr[i]);
                    Pair cp = new Pair(nn,0);
                    stk.push(cp);
                    top.node.right = nn;
                }
                i++;
                top.st++;
            }
            else if(top.st == 2)
            {
                //pop,done
                stk.pop();
            }
        }
        return root;
    }
    public static void preOrder(Node node){
        if(node == null)
         {
             return;
         }
         System.out.print(node.data+" ");
         preOrder(node.left);
         preOrder(node.right);
    }
    public static void postOrder(Node node){
        if(node == null)
        {
            return ;

        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");

    }
    public static void inOrder(Node node){
        if(node ==null)
        {
            return ;

        }
        inOrder(node.left);
        System.out.print(node.data+" ");

        inOrder(node.right);
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<n;i++)
        {
            arr[i] = scn.nextInt();

        }
        Node root = getBTree(arr);
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();

        inOrder(root);
    }
}
