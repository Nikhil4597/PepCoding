import java.io.*;
import java.util.*;

public class Q_7 {

    public static void main(String[] args) throws Exception {
  Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<n;i++)
        {
        arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        boolean ans = targerSumSubarr(arr,target);
        System.out.println(ans);
    }
    public static boolean targerSumSubarr(int[] arr,int target)
    {
    int n = arr.length+1;
    int m = target+1;
    boolean[][] dp = new boolean [n][m];
    for(int i =0;i<n;i++)
    {
    for(int j =0;j<m;j++)
    {
    if(i ==0&&j==0)
    {
        dp[i][j] =true;
    }
    else if(i==0)
    {
        dp[i][j] = false;    
    }
    else if(j ==0)
    {
        dp[i][j] =true;
    }
    else
    {
        if(dp[i-1][j]==true){
                dp[i][j] =dp[i-1][j];}
        else
        {
                int val = arr[i-1];
                        if(j>=val)
                        {
                                if(dp[i-1][j-val]==true)
                                    {dp[i][j]=true;}
                        }
        }
    
    }
    }
    }
    return dp[n-1][m-1];
    }
}
