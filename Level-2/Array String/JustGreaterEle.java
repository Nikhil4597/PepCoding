import java.util.*;
public class JustGreaterEle{
    public static int getJustLarge(int [] arr,int k)
    {
        int val = arr[k];
        int idx = k;
        int mv = arr[k];
        for(int i = k+1;i<arr.length;i++)
        {
            if(arr[i]>val)
            {
                // System.out.println(arr[i]);
                if(mv>arr[i])
                {
                System.out.println(arr[i]);

                    idx = i;
                }
                    mv = arr[i];
            }
        }
        return idx;
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int  [] arr = {8,7,3,9,4,8,7,5,2};
        int k = scn.nextInt();
        System.out.println(getJustLarge(arr,k));
    }
}