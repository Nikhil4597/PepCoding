import java.util.*;
public class Wiggle{
    public static int [] wiggleSort(int [] arr)
            {
                for(int i =0;i<arr.length-1;i++)
                {
                    if(i%2==0 && arr[i]>arr[i+1]){
                        swap(arr,i,i+1);
                    }
                    else if(i%2!=0 && arr[i]<arr[i+1]){
                        swap(arr,i,i+1);
                    }
                }
                return arr;
    }
    public static void swap(int [] arr ,int i,int j)
    {
        int val = arr[i];
        arr[i] = arr[j];
        arr[j] = val;
    }
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        int [] ans = wiggleSort(arr);
        for(int i:ans)
        {
            System.out.println(i);
        }
    }
}