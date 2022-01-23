import java.util.*;
public class PaintWithManyColor{
  public static void main(String [] args )
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
    int [] [] paintcost = new int [n] [k];
    for(int i =0;i<n;i++)
    {
      for(int j =0;j<k;j++)
      {
        paintcost[i][j] = scn.nextInt();
       }
    }
    System.out.println(minCost(paintcost));
  }
  public static int minCost(int [] [] paintcost)
  {
    int n = paintcost.length;
    int k = paintcost[0].length;
    int [] []dp = new int [n][k];
    int min = Integer.MAX_VALUE;
    int secmin =Integer.MAX_VALUE;
    for(int i =0;i<n;i++)
    {
      int newmin =Integer.MAX_VALUE;
      int newsecmin = Integer.MAX_VALUE;
      for(int j =0;j<k;j++)
      {
         if(i==0)
         {
           dp[i][j] = paintcost[i][j];
         }
         else
         {
           if(dp[i-1][j]==min)
           {
             dp[i][j] =secmin+paintcost[i][j];
           }
           else
           {
             dp[i][j] = min+paintcost[i][j];
           }
         }
         if(dp[i][j]<newmin)
         {
           newsecmin = newmin;
           newmin = dp[i][j];
         }
         else if(dp[i][j]<newsecmin)
         {
           newsecmin = dp[i][j];
         }
        }
         min =newmin;
         secmin =newsecmin;
      
    }
    return min;
  }
}
