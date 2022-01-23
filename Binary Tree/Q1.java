import java.util.*;
public class Q1 {
    public static  class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static class Pair{
        Node node;
        int st;
        Pair(Node node,int st)
        {
            this.node = node;
            this.st = st;
        }
    }
    public static  int size(Node node)
    {
        if(node == null)
        {
            return 0;
        }
         int ls = size(node.left);
         int rs = size(node.right);
         return  ls+rs+1;    

    }
    public static int sum(Node node)
    {
        if(node== null){
            return 0;

        }
        int ls = sum(node.left);
        int rs = sum(node.right);
        return ls+rs+node.data;
    }
    public static int max(Node node)
    {
        if(node == null)
        {
            return Integer.MIN_VALUE;
        }
        int lmax = max(node.left);
        int rmax = max(node.right);
        return Integer.max(Math.max(lmax,rmax),node.data);
    }
    public static int height(Node node)
    {
        if(node == null)
        {
            return -1;
        }
        int left =height(node.left);
        int right = height(node.right);
        return Math.max(left,right)+1;
    }
    public static Node getBTree(int [] arr)
    {
        Stack <Pair> stk = new Stack <>();
        Node root  = new Node(arr[0]);
        stk.push(new Pair(root,0));
        int i =1;
        while(stk.size()>0)
        {
            Pair top = stk.peek();
            if(top.st == 0)
            {
                if(arr[i] == -1)
                {
                    top.node.left = null;
                }
                else{
                    Node nn  = new Node(arr[i]);
                    Pair np = new Pair(nn,0);
                    stk.push(np);
                    top.node.left = nn;
                }
                i++;
                top.st++;
            } 
            else if(top.st == 1)
            {
                if(arr[i]== -1)
                {
                  top.node.right = null;  
                }
                else{
                    Node nn = new Node(arr[i]);
                    Pair np = new Pair(nn,0);
                    stk.push(np);
                    top.node.right = nn;
                }
                i++;
                top.st++;
            }
            else{
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
        String md = " <- "+(node.data)+" -> " ;
        String ld = (node.left == null)?".":(node.left.data)+"";
        String rd = (node.right == null)?".":(node.right.data)+"";
        System.out.println(ld+md+rd);
        show(node.left);
        show(node.right);
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int  [n];
        for(int i =0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Node root = getBTree(arr);
        show(root);
        int size = size(root);
        int sum = sum(root);

        int max = max(root);
        int ht = height(root);
        System.out.println(size);
        System.out.println(sum);
        System.out.println(max);
        System.out.println(ht);
    }
}
//input 19 50 25 12 -1 -1 37 30 -1 -1 -1 75 62 -1 70 -1 -1 87 -1 -1