import java.util.*;
public class  tileprob2{
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);

int n =scn.nextInt();
int m = scn.nextInt();
System.out.println(findWays(n,m));
}
public static int findWays(int n,int m)
{
int  []dp = new int [n+1];
	for(int i =0;i<=n;i++)
	{
	 if(i<m)
	 {
	 dp[i] =1;
	 }
	 else if(i==m)
	 {
	 dp[i] =2;
	 }
	 else {
	 dp[i] = dp[i-1]+dp[i-m];
	 }
	
	}
	return dp[n];
}
}
