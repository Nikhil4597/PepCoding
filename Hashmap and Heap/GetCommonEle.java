import java.util.*;
public class GetCommonEle{
    public static ArrayList <Integer> getCommomEle(int [] arr1,int [] arr2){
        HashMap <Integer,Boolean> map  = new HashMap <>();
        for(int i =0;i<arr1.length;i++)
        {
            int k = arr1[i];
            if(map.containsKey(k)==false)
            {
                map.put(k,true);

            }

        }
        ArrayList <Integer> ans = new ArrayList <>();

        // System.out.println(map);
        for(int i =0;i<arr2.length;i++)
        {
            int k = arr2[i];
            if(map.containsKey(k)==true)
            {
                ans.add(k);
                map.remove(k);
            }
        }

        return ans;
    }

    
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int [] arr1 =new int [n1];

        for(int i =0;i<n1;i++)
        {
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int [] arr2 = new int [n2];
        for(int i =0;i<n2;i++)
        {
            arr2[i] = scn.nextInt();
        }
        ArrayList <Integer> ans = getCommomEle(arr1,arr2);
        for(int i:ans)
        {
            System.out.println(i);
        }
    }
}