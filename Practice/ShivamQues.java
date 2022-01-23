import java.util.*;
public class ShivamQues{
  public static void main(String [] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(maxQuad(n));
  }
  public static int maxQuad(int n)
  {
    if(n==1)
    {
      return 2;
    }
    int [] dp = new int [n+1];
    dp[1] =2;
    dp[2] =dp[1]+2;
    for(int i =3;i<=n;i++)
    {
      if(i%2==0)
      dp[i] = dp[i-1]+(i-((i-1)/2));
      else
      {

        dp[i] = dp[i-1]+(i-(i/2));
      }
    }
    return dp[n];
  }
}
