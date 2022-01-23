import java.util.*;
public class Q_8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<n;i++)
        {arr[i]= scn.nextInt();}
        int amt = scn.nextInt();
        int ans =tar_coinChange(arr,amt);
        System.out.println(ans);
        // int ans = coinChangePermu(arr,amt,0);
        // System.out.println(ans);
    }
    public static int coinChangePermu(int [] arr,int amt,int sum)
    {
        if(sum==amt)
        {
            return 1;
        }
        if(sum>amt)
        {
            return 0;
        }
        int ans =0;
        for(int i =0;i<arr.length;i++)
        {
            ans+=coinChangePermu(arr, amt, sum+arr[i]);
        }

        return ans;
        }
        //just a way to solve these type of question
    public  static int tar_coinChange(int [] arr ,int amt) {
        int [] dp = new int [amt+1];
        dp[0] =1;
        for(int i =1;i<=amt;i++)
        {
            for(int j =0;j<arr.length;j++)
            {
                int rest_amt = i-arr[j];
                if(rest_amt>=0)
                {
                    dp[i]+=dp[rest_amt];

                }
            }
        }
        return dp[amt];
        }
        //better Approach
        public static void DpApproch(int [] arr,int amt) {
            int [][] dp = new int [arr.length][amt+1];
            
        }
}
