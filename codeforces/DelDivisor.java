import java.util.*;
public class DelDivisor {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            boolean ans = delDivisor(n);
            System.out.println(ans==true?"Alice":"Bob");
        }
    }
    public static boolean delDivisor(int n)
    {
        boolean [] dp = new boolean [n+1];
        dp[0] =false;
        dp[1] = false ;
        for(int i =2;i<=n;i++)
        {
            for(int j =1;j<i;j++)
            {
                if(i%j==0)
                {
                    if(dp[i-j]== false)
                    {
                        dp[i] =true;
                        break;
                    }
                }
            }
        }
        return dp[n];
    }
}