import java.util.*;
public class Arti1{
  public static void main(String[] args) {
    Scanner scn=  new Scanner(System.in);
    int  n = scn.nextInt();
    System.out.println(findAns(n));

  }
public   static int findAns(int n)
{
  int [] dp = new int [n+1];
  dp[1] = 3;
  for(int i=2;i<=n;i++)
  {
    dp[i] = dp[i-1]+(2*i);
  }
  return dp[n];
}
}
