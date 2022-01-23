import java.util.*;
public class LongestConsectiveSeq{
    public static void getLCS(int [] arr)
    {
        HashMap <Integer,Boolean> map = new HashMap<>();
        //  set all the element is starting point
        for(int i =0;i<arr.length;i++)
        {
             map.put(arr[i],true);
        }
        // discard elementwhich cant't be a start point
        for(int i =0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]-1)==true)
            {
                map.put(arr[i],false);

            }
        }
        // find the logest consticutive seq 
        int maxlen =0;
        int st = 0;
        for(int i =0;i<arr.length;i++)
        {
            if(map.get(arr[i])== true)
            {
                int len =0;
                while(map.containsKey(arr[i]+len)==true){
                    len++;

                }
                if( len>maxlen)
                {
                    maxlen = len;
                    st = arr[i];
                }
            }
        }
        for(int i =st;i<st+maxlen;i++)
        {
            System.out.println(i);
        }
    }
    
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr  = new int [n];
        for(int i =0;i<n;i++)
        {
            arr[i] = scn.nextInt();

        }
         getLCS(arr);
        System.out.println();

    }
}