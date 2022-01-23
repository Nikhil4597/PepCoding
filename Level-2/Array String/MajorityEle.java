import java.util.*;
public class MajorityEle{
    public static int majorityElement(int [] nums)
    {
        
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println(majorityElement(arr));
    }
}