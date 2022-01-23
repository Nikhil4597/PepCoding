import java.util.*;
public class AddNode{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static class Pair{
        int st ;
        Node  node;
        Pair(Node node, int st)
        {
            this.node =node;
            this.st = st;
        }
    }
    public static Node getBTree(int [] arr)
    {
        Stack <Pair> stk = new Stack<>();
        Node root = new Node(arr[0]);
        stk.push(new Pair(root , 0));
        int i =1;
        while(stk.size()>0)
        {
            Pair top = stk.peek();
            if(top.st ==0)
            {
                //left
                if(arr[i] == -1)
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
            return ;
        }
        String curr = "<-"+node.data+"->";
        String pre = (node.left == null)?".":node.left.data+"";
        String post = (node.right == null)?".":node.right.data+"";
        System.out.println(pre+curr+post);
        show(node.left);
        show(node.right);
    }
    public static Node addNode (Node node,int data)
    {   
        if(node == null)
        {
            return new Node(data);
        }
        if(node.data == data)
        {
            return node;
        }
        else if(node.data>data)
        {
            node.left= addNode(node.left,data);
        }
        else{
            node.right = addNode(node.right,data);
        }
        return node;
    } 
    public static Node remove(Node node ,int data)
    {
        if(node.data> data)
        {
            node.left = remove(node.left,data);
        }
        else if(node.data<data)
        {
            node.right = remove(node.right,data);
        }
        else{
            if(node.right == null && node.left == null)
            {
                return null;

            }
            else if(node.right == null)
            {
                return node.left;
            }
            else if(node.left == null)
            {
                return node.right;
            }
            else{
                int lmax = max(node.left);
                node.data = lmax;
                node.left = remove(node.left,lmax);
            }
        }
        return node;
    }
    public static int max(Node node)
    {
        if(node == null)
        {
            return Integer.MIN_VALUE;
        }
        if(node.right == null)
        {
            return node.data;
        }
        int max = max(node.right);
        return max;
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<n;i++)
        {
            arr[i] =scn.nextInt();

        }
        Node root = getBTree(arr);
        int data = scn.nextInt();
        Node newRoot = addNode(root,data);
        show(newRoot);
        int rm = scn.nextInt();
        Node rmNode = remove(newRoot,rm);
        show(rmNode);
    }
}