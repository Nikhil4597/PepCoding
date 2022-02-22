import java.util.*;
public class WiggleSort{
    public static void wiggleSort(int [] nums)
    {
           Arrays.sort(nums);
            int  n = nums.length;
            int mid = (n-1)/2;
            // System.out.println("mid "+arr[mid]);
            int  [] ans = new int [n];
            int i =(n-1)%2 ==0 ? n-1:n-2;
            int j =1;

            for(int k =0;k<nums.length;k++)
            {
                if(nums[mid]>=nums[k] && i>=0)
                {
                    ans[i] = nums[k];
                    i-=2;
                }
                else if(nums[mid]<nums[k] && j<n){
                    ans[j] = nums[k];
                    j+=2;
                }
            }
            for(int k =0;k<n;k++)
            {
                if(ans[k] ==0)
                {
                    ans[k] = nums[mid];
                }
            }
            for(int k =0;k<n;k++)
            {
                nums[k] = ans[k];
            }
    }
    public static void swap(int [] arr,int i ,int j)
    {
        int val = arr[i] ;
        arr[i] = arr[j];
        arr[j] = val;
    }
    public static void main(String [] args)
    {
        int [] arr = {1,3,2,2,3,1};
         wiggleSort(arr);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}