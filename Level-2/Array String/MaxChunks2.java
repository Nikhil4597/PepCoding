import java.util.*;
public class MaxChunks2{
    public static int maxChunks(int [] arr)
    {
        int n = arr.length;
        int  [] min = new int [n];
        min[0] = arr[0];
        int [] max = new int [n];
        max[n-1] = arr[n-1];
        for(int i =1;i<n;i++)
        {
            max[i] = Math.max(arr[i-1],arr[i]);
        }
        for(int i = n-2;i>=0;i--cd)
        {
            min[i] = Math.min(arr[i],arr[i+1]);
        }
        int chunks =0;
        for(int i =0;i<n;i++)
        {
            if(max[i]<min[i])
            {
                chunks++;
            }
        }
        return chunks++;
    }
    public static void main(String [] args)
    {
        int [] arr = {5,4,3,2,1};
        System.out.println(maxChunks(arr));
    }
}