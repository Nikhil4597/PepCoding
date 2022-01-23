import java.util.*;
public class MaxProof3{
    public static int maxPro(int [] arr)
    {
        if(arr.length ==3)
        {
            return arr[0]*arr[1]*arr[2];
        }
        int max1 =Integer.MIN_VALUE;
        int max2 =Integer.MIN_VALUE;
        int max3 =Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i =0;i<arr.length;i++)
        {
            if(max1<arr[i])
            {
                max3 = max2;
                max2 = max1;
                max1= arr[i];
            }
            else if(max2<arr[i])
            {
                max3 = max2;
                max2 = arr[i];
            }
            else if(max3<arr[i])
            {
                max3 = arr[i];
            }
            if(min1>arr[i])
            {
                min2 = min1;
                min1 = arr[i];
            }
            else if(min2>arr[i])
            {
                min2 =arr[i];
            }
        }
        System.out.println(max1+" "+max2+" "+max3+" "+min1+" "+min2);
        
        return Math.max(min1*min2*max1,max1*max2*max3);
    }
    public static void main(String [] args)
    {
        int [] arr = {1,2,3,2};
        System.out.println(maxPro(arr));
    }
}