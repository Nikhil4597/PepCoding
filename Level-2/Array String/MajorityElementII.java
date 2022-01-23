import java.util.*;
public class MajorityElemnetII{
    public static ArrayList <Integer> majorityElement(int [] nums)
    {
          int val1 =nums[0];
        int count1 =1;
        int val2 = nums[0];
        int count2  =0;
        for(int i =1;i<nums.length;i++)
        {
            if(val1 ==nums[i] )
            {
                count1++;
            }
            else if(val2 == nums[i])
            {
                count2++;
            }
            else if(count1 == 0)
            {
                val1 = nums[i];
                count1 =1;
               
            }
             else if(count2 == 0)
            {
                val2 = nums[i];
                count2 =1;
            }
            else{
                    count1--; count2--;
            }
            
        }
        
        int cv1 =0;
        int cv2 =0;
        
        for(int j =0;j<nums.length;j++)
        {
            if(nums[j] == val1)
            {
                cv1++;
            }
            else if(nums[j] == val2)
            {
                cv2++;
            }
        }
        System.out.println(cv1+" "+ cv2);
       ArrayList <Integer> ans = new ArrayList <> ();
        if(cv1>nums.length/3)
        {
            ans.add(cv1);
        }
        if(cv2>nums.length/3)
        {
            ans.add(cv2);
        }
        return ans;
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
        ArrayList <Integer> ans = majorityElement(arr);
        for(int i:ans)
        {
            System.out.println(i);
        }

    }
}