import java.util.*;
public class CarPool{
    public static boolean carPooling(int  [] [] trips,int capacity)
    {
        int len = Integer.MIN_VALUE;
        for(int i =0;i<trips.length;i++)
        {
            len = Math.max(len,trips[i][2]);
        }
        int [] ans = new int [len+1];
        for(int i=0;i<trips.length;i++)
        {
            int from =trips[i][1];
            int to = trips[i][2];
            ans[from]+= trips[i][0];
            ans[to]+= (-trips[i][0]);
        }
        int [] preSum = new int [ans.length];
        preSum[0] = ans[0];
        for(int i =1;i<ans.length;i++)
        {
            preSum[i] = ans[i]+preSum[i-1];
        }
        for(int i =0;i<ans.length;i++)
        {
            int val = ans[i];
             

            if(preSum[i]>capacity)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] []arr = new int [n][3];
        for(int i =0;i<n;i++)
        {
            arr[i][0] = scn.nextInt();
            arr[i][1] = scn.nextInt();
            arr[i][2] = scn.nextInt();

        } 
        int cap  = scn.nextInt();
        System.out.println(carPooling(arr,cap));
    }
}