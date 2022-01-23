import java.util.*;
public class GoldmineDP{
  public static void main(String [] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int [][]maze = new int [n][m];
    for(int i =0;i<n;i++)
    {
      for(int j =0;j<m;j++)
      {
        maze[i][j] = scn.nextInt();
      }
    }
    System.out.println(maxGold(maze));
  }
  public static int maxGold(int [][]maze)
  {
    int m = maze.length;
    int n = maze[0].length;
    int [][] dp = new int [m][n];
    for(int j = n-1;j>=0;j--)
    {
      for(int i =0;i<n;i++)
      {
        if( j == n-1)
        {
          dp[i][j] = maze[i][j] ;
        }
        else if(i==0)
        {
          dp[i][j] =Math.max(dp[i][j+1],dp[i+1][j+1])+maze[i][j];
        }
        else if(i == m-1)
        {
          dp[i][j] = Math.max(dp[i][j+1],dp[i-1][j+1])+maze[i][j];
        }
        else
        {
          dp[i][j] = Math.max(Math.max(dp[i][j+1],dp[i+1][j+1]),dp[i-1][j+1])+maze[i][j];
        }
      }
    }
    int maxgold = Integer.MIN_VALUE;
    for(int i =0;i<dp.length;i++)
    {
      if(maxgold<dp[i][0])
      {
        maxgold =dp[i][0];
      }
    }

    return maxgold;
  }
}
