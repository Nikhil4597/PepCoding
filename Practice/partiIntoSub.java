import java.util.*;
public class partiIntoSub{
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int k = scn.nextInt();
System.out.println(findWays(n,k));
}
public static int findWays(int n,int k)
{
int [][] dp = new int [n+1][k+1];
for(int i =1;i<=n;i++)
{
for(int j=1;j<=k;j++)
{
 if(i==1||i==j)
{
dp[i][j] = 1;
}
else  {
dp[i][j] = dp[i-1][j-1]+(j*dp[i-1][j]);
}
}
}
return dp[n][k];
}

}
