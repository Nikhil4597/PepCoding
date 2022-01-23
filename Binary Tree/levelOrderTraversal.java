import java.util.*;

public class levelOrderTraversal {
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
        Pair(Node node,int st)
        {
            this.node = node;
            this.st = st;
        }
    } 
    public static Node getBTree(int [] arr)
    {
        Node root = new Node(arr[0]);
        Stack <Pair> stk = new Stack <>();
        stk.push(new Pair(root,0));
        int i =1;
        while(stk.size()>0){
            Pair top = stk.peek();
            if(top.st ==0)
            {
                if(arr[i] == -1)
                {
                    top.node.left =null;
                }
                else {
                    Node nn = new Node(arr[i]);
                    Pair cp = new Pair(nn,0);
                    stk.push(cp);
                    top.node.left = nn;
                }
                top.st++;
                i++;
            }
            else if(top.st ==1)
            {
                if(arr[i] == -1)
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
            else if(top.st ==2)
            {
                stk.pop();
            }
        }
        return root;

    }
    public static void levelOrder(Node node)
    {
        ArrayDeque <Node> q = new ArrayDeque<>();
        q.add(node);
        while(q.size()>0)
        {
            int size = q.size();
            for(int i =0;i<size;i++)
            {
                //remove
                Node rm = q.remove();
                //work
                System.out.print(rm.data+" ");
                if(rm.left!=null)
                {
                    q.add(rm.left);
                }
                if(rm.right != null)
                {
                    q.add(rm.right);
                }
            } 
            System.out.println();
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
        levelOrder(root);
    }
}
