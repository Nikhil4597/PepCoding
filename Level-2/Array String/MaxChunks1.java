import java.util.*;
public class MaxChunks1{
    public static int maxChunks(int [] arr)
    {
        int count = 0;
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
             if(max == i)
             {
                 count++;
             }
        }
        return count;
    }
    public static void main(String [] args)
    {
        // Scanner scn = new Scanner(System.in);
        int [] arr ={4,3,2,1,0};
        System.out.println(maxChunks(arr));
    }
}