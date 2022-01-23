import java.util.*;
public class TargetSumPair{
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
        Node node;
        Pair(Node node,int st){
            this.node = node;
            this.st = st;
        }

    }
    public static Node getBTree(int [] arr)
    {
        Stack <Pair> stk = new Stack<>();
        Node root = new Node(arr[0]);
        stk.push(new Pair(root ,0));
        int i = 1;
        while(stk.size()>0)
        {
            Pair top = stk.peek();
            if(top.st ==0)
            {
                //left work
                if(arr[i]==-1)
                {
                    top.node.left = null;
                }
                else{
                    Node nn = new Node(arr[i]);
                    stk.push(new Pair(nn,0));
                    top.node.left = nn;

                }
                top.st++;
                i++;

            }
            else if(top.st ==1)
            {
                //right
                if(arr[i]==-1)
                {
                    top.node.right= null;
                }
                else{
                    Node nn = new Node(arr[i]);
                    stk.push(new Pair(nn,0));
                    top.node.right= nn;

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
    public static void getPairSum(Node node ,int num){
        ArrayList <Integer> in = new ArrayList <>();
        getin(node,in);
        int i =0;
        int j = in.size()-1;
        while(i<j)
        {
            int sum =in.get(i)+in.get(j); 
            if(sum==num)
            {
                System.out.println(in.get(i)+" "+in.get(j));
                i++;
                j--;
            }
            else if(sum>num){
                j--;
            }
            else{
                i++;
            }
        }
    }
    public static void getin(Node node,ArrayList<Integer> in){
        if(node == null)
        {
            return;
        }
        getin(node.left,in);
        in.add(node.data);
        getin(node.right,in);
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Node root = getBTree(arr);
        int num = scn.nextInt();
        getPairSum(root,num);


    }
}