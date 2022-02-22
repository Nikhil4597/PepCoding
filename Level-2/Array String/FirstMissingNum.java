import java.util.*;
public class FirstMissingNum{
    public static int firstMissingPositive(int [] nums)
    {
        int min = Integer.MIN_VALUE;
        boolean one = false;
        for( int  i=0;i<nums.length;i++)
        {
            if(nums[i]<1 || nums[i]>nums.length)
            {
                nums[i] = min;

            }
            else if(nums[i] ==1)
            {
                one = true;
            }
        }
        if(one == false)
        {
            return 1;
        }
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i] != min && nums[i]>0)
            {
                nums[nums[i]-1] = -nums[nums[i]-1];
            }
        }
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                return i+1;
            }
        }
        return nums.length+1;
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        int n  = scn.nextInt();
        int [] arr  = new int [n] ;
        for(int i =0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println(firstMissingPositive(arr));
    }
}