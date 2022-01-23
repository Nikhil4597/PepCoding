import java.util.*;
public class kLargest{
    public static void getKLargest(int [] arr,int k){
        PriorityQueue <Integer> que= new PriorityQueue<>();
        for(int i =0;i<=k;i++)
        {
            que.add(arr[i]);
        }
        for(int i =k+1;i<arr.length;i++)
        {
            System.out.println(que.remove());
            que.add(arr[i]);
        }
        while(que.size()>0)
        {
            System.out.println(que.remove());
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
        int k = scn.nextInt();
        System.out.println();
        getKLargest(arr,k);
    }
}