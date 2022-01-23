import java.util.*;
public class Q_12 {
    public static void main(String [] args )
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int  ans= countBinaryString(n);
        System.out.println(ans);
    }
    public static int countBinaryString(int n)
    {
        int [][] dp = new int [2][n+1];
        dp[0][1] = 1;
        dp[1][1] = 1;
        for(int i =2;i<=n;i++)
        {
            for(int j=0;j<2;j++)
        {
            if(j==0)
            {
                dp[j][i] =dp[1][i-1];
            }
            else
            {
                dp[j][i] = dp[0][i-1]+dp[1][i-1];
            }
        }
        }
        return dp[0][n]+dp[1][n];
    }
}
