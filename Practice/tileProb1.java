import java.util.*;
 public  class tileProb1{
public static void main(String [] args)
{
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	System.out.println(findWays(n));
}
public static int findWays(int n)
{
int [] dp = new int [n+1];
dp[1] =1;
dp[2] =2;
for(int i=3;i<=n;i++)
{
dp[i]= dp[i-1]+dp[i-2];
}
return dp[n];
}
}
