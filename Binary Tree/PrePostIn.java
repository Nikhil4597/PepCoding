import java.util.*;

public  class PrePostIn {
    public static class Node{
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
    public static  Node getBTree(int [] arr){
        Stack <Pair> stk = new Stack<> ();
        Node root  = new Node(arr[0]);
        stk.push(new Pair(root,0));
        int i=1;
        while(stk.size()>0)
        {
            Pair top = stk.peek();
            if(top.st ==0)
            {
                if(arr[i]==-1)
                {
                    top.node.left =null;
                }

                else{
                    Node nn = new Node(arr[i]);
                    stk.push(new Pair(nn,0));
                    top.node.left = nn;
                }
                i++;
                top.st++;
            }
            else if(top.st ==1){
                if(arr[i] == -1)
                {
                    top.node.right =null;

                }
                else{
                    Node nn = new Node(arr[i]);
                    stk.push(new Pair(nn,0));
                    top.node.right = nn;
                }
                i++;
                top.st++;
            }
            else if(top.st == 2)
            {
                stk.pop();

            }
        }
        return root ;

    }
    public static void getPrePostIn(Node node){
        
        Stack <Pair> stk = new Stack<>();
        stk.push(new Pair(node,0));
        String pre="";
        String in="";
        String post="";
        while(stk.size()>0)
        {
            Pair top = stk.peek();
            if( top.st ==0)
            {
                
                pre+=top.node.data+" ";
                top.st++;
                if(top.node.left!= null)
                {
                    stk.push(new Pair(top.node.left,0));
                }
               
            }
            else if(top.st==1)
            {
                in+=(top.node== null)?"":top.node.data+" " ;
                top.st++;
                if(top.node.right != null)
                {
                    stk.push(new Pair (top.node.right,0));
                }
            }
            else if(top.st ==2)
            {
                post+=(top.node == null)?"":top.node.data+" ";
                stk.pop();
            }
        }
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
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
        getPrePostIn(root);
    }
}
