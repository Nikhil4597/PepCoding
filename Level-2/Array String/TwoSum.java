import java.util.*;
public class TwoSum{
    public static List<List<Integer>> twoSum(int [] nums ,int target)
    {
            List <List<Integer>> ans = new ArrayList<List<Integer>> ();
    
            HashMap <Integer,Integer> map = new HashMap <> ();
            for( int i =0;i<nums.length;i++)
            {
                if(map.containsKey(target-nums[i]))
                {    
                    List <Integer> list = new ArrayList<> ();
                    list .add(map.get(target - nums[i]));
                    list.add(i);
                    ans.add(list);
                }
                map.put(nums[i],i);
            }
            return ans;
    }
    public static void main(String [] args)
    {
        int [] arr = {10,10,30,40,50,20};
        int target = 60;
        System.out.println(twoSum(arr,target));
    }
}