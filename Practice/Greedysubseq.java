import java.util.*;
public class Greedysubseq{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<n;i++)
        {
        arr[i] = scn.nextInt();
        }
        System.out.println(maxNum(arr));
        
    }    
    public static int maxNum(int [] arr)
    {
    int inc =arr[0];
    int exc = 0;
    for(int i =1;i<arr.length;i++)
    {
      int  incsf = exc+arr[i];
      int excsf = Math.max(inc,exc);
      inc = incsf;
      exc = excsf;
    }
    return Math.max(inc,exc);
//        int [][] dp =new int [2][arr.length];
//        dp[0][0] =arr[0];
//        dp[1][0] = 0;
//        for(int i =0;i<dp.length;i++)
//        {
//            for(int j =1;j<dp[0].length;j++)
//            {
//                if(i==0)
//                {
//                dp[i][j] =arr[j]+dp[1][j-1];
//                }
//                else if(i==1)
//                {
//                dp[i][j] = Math.max(dp[i-1][j-1],dp[i][j-1]);
//                
//                }
//            }
//        }
//        return Math.max(dp[0][dp.length-1],dp[1][dp.length-1]);
  }
    
    }
