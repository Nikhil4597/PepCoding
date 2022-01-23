import java.util.*;
public class FirstMissingNum{
    public static int firstMissingPositive(int [] nums)
    {
        int i =0;
        int j = nums.length-1;
        while(i<j)
        {   
            if(nums[i]>0 && nums[j]<0)
            {
                i++;
                j--;
            }
        
            else if(nums[i]>0)
            {
                i++;
            }
            else if(nums[j]<=0)
            {
                j--;
            }
            else{
                 swap(nums,i,j);
                    i++;
                    j--;
            }
        }

        // for(int k=0;k<nums.length;k++)
        // {
        //     System.out.println(nums[k]+" ");
        // }

        int ans = getAns(nums,j);

        return ans;
    }
    public static  int getAns(int [] arr, int pvi)
    {
        System.out.println(pvi);
        for(int i =0;i<pvi;i++)
        {
            if(arr[i]>0 && arr[i] < pvi)
            {
                int idx =arr[i];
                if(arr[idx-1]>0){
                    arr[idx-1] = -arr[idx-1];
                }
            }
        }
        int mv=1;
        for(int i =0;i<pvi;i++)
        {
            if(arr[i]<0)
            {
                mv++;
            }
            else{
                return mv;
            }
        }
         
        return pvi+1;
    }
    private  static  void  swap(int [] arr ,int i ,int j)
    {
        int val = arr[i];
                arr[i] = arr[j];
                arr[j] = val;
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