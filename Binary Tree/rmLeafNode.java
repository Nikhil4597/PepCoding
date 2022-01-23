import java.util.*;
/**
 * rmLeafNode
 */
public class rmLeafNode {

    public static class Node {
        int data ;
        Node  right;
        Node left;
        Node (int data)
        {
            this.data =  data;
        }

    }
    public static  class Pair{
        int st ;
        Node node;
        Pair(Node node,int st)
        {
            this.node = node;
            this.st =st;
        }
    }
    public static Node getBTree(int [] arr)
    {
        Stack <Pair> stk = new Stack<>();
        Node root = new Node(arr[0]);
        stk.push(new Pair(root, 0));
        int i =1;
        while (stk.size()>0) {
            Pair top = stk.peek();
            if(top.st ==0)
            {
                if(arr[i]==-1)
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
            else if(top.st ==2)
            {
                stk.pop();
            }
            
        }
        return root ;
    

    }
    public static  Node removeLeaf(Node node) {
        if(node == null)
        {
            return null;
        }
        else if(node.left == null && node.right == null)
        {
            return null;
            }
        node.left= removeLeaf(node.left);
        node.right = removeLeaf(node.right);
        return node;
    }
    public static void show(Node node)
    {
        if(node == null)
        {
            return ;

        }
        String cn = node.data+"";
        String lc = (node.left==null)?".":node.left.data+"";
        String rc = (node.right==null)?".":node.right.data+"";
        System.out.println(lc+"<-"+cn+"->"+rc);
        show(node.left);
        show(node.right);

    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr   = new int [n];
        for(int i =0;i<n;i++)
        {
            arr[i] = scn.nextInt();

        }
        Node root = getBTree(arr);
        show(root);

        root= removeLeaf(root);
        show(root);
    }
}     
