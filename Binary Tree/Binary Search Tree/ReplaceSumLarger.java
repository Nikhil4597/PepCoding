import java.util.*;
public class AddRe3moveNode{
    public static  class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static class Pair{
        int st;
        Node node;
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
        stk.push(new Pair(root,0));
        int i =1;
        while(stk.size()>0)
        {
            Pair top = stk.peek();
            if(top.st ==0)
            {
                if(arr[i]== -1 )
                {
                    top.node.left =null;
                }
                else
                {
                    Node nn = new Node(arr[i]);
                    stk.push(new Pair(nn,0));
                    top.node.left =nn;
                }
                top.st++;i++;
            }
            else if(top.st ==1)
            {
                if(arr[i] == -1 )
                {
                    top.node.right = null;
                }
                else{
                    Node nn = new Node(arr[i]);
                    stk.push(new Pair (nn,0));
                    top.node.right =nn;

                }
                top.st++;
                i++;

            }
            else if(top.st ==2)
            {
                stk.pop();
            }
        }
        return root;
    }
    public static void show(Node node)
    {
        if(node == null)
        {
            return;
        }
        String ans = "<--"+node.data+"-->";
        String pre = (node.left == null)?".":node.left.data+"";
        String post = (node.right == null)?".":node.right.data+"";
        System.out.println(pre+ans+post);   
        show(node.left);
        show(node.right);
    }
    static int sum = 0;
    public static void rwSol(Node node)
    {
        if(node == null)
        {
            return ;
        }
        // reverse pre order usage
        rwSol(node.right);
        int nd = node.data;
        node.data  = sum;
        sum+=nd;
        rwSol(node.left);   
    }
    public static int lca(Node node,int d1,int d2)
    {
        if(node.data>d1 && node.data>d2)
        {
            return lca(node.left,d1,d2);
        }
        else if(node.data<d1 && node.data<d2)
        {
            return lca(node.right,d1,d2);
        }
        else{
            return node.data;
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
        Node root = getBTree(arr);
        int d1 = scn.nextInt();
        int d2 = scn.nextInt();

        int ans = lca(root,d1,d2);
        System.out.println(ans);

    }

}
