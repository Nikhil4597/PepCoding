import java.util.*;
public class IscBalance{
    public static class Node{
        int data;
        Node   left;
        Node right;
        Node(int data)
        {
          this.data = data ;

        }

    }
    public  static class Npair{
        int st;
         Node node;
         Npair(Node node,int st){
             this.node = node;
             this.st = st;

         }
    }
    public static Node getBTree(int [] arr)
    {
        Stack <Npair> stk  = new Stack <>();
        Node root = new Node(arr[0]);
        stk.push(new Npair(root,0));
        int i =1;
        while(stk.size()>0)
        {
            Npair top = stk.peek();
            if(top.st ==0)
            {
                //left work
                if(arr[i] ==-1)
                {
                    top.node.left = null;
                }
                else{
                    Node nn = new Node(arr[i]);
                    stk.push(new Npair(nn,0));
                    top.node.left = nn;

                }
                top.st++;i++;
            }
            else if(top.st ==1)
            {
                //right work
                if(arr[i] == -1)
                {
                    top.node.right = null;

                }
                else{
                    Node nn = new Node(arr[i]);
                    stk.push(new Npair(nn,0));
                    top.node.right = nn;
                }
                top.st++;
                i++;
            }
            else if(top.st ==2)
            {
                //post work
                stk.pop();
            }
        }
        return root ;
    }
   static  boolean bal;
    public static boolean isBal(Node node)
    {
        bal = true;
        height(node);
        return bal;
    }
    public static int height(Node node)
    {
        if(node == null)
        {
            return -1;
        }
        int lh  =height(node.left);
        int rh = height(node.right);
        int cbal = Math.abs(lh-rh);
        if(cbal>= 2)
        {
            bal = false;
            
        }
        return Math.max(lh,rh)+1;

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
        Node root = getBTree(arr);
        System.out.println(isBal(root));
        
    }
}   