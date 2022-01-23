import java.util.*;
public class MinCostMazeTraversal{
  public static void main(String [] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int [][] maze = new int [n][m];
    for(int i =0;i<n;i++)
    {
      for(int j =0;j<m;j++)
      {
        maze[i][j] = scn.nextInt();
      }
    }
    System.out.println(minCost(maze));
  }
  public static int minCost( int [][] maze)
  {
      int   m = maze.length;
      int n = maze[0].length;
    int [][] dp = new int [m][n];
          for(int i =m-1;i>=0;i--)
      {
        for(int j =n-1;j>=0;j--)
        {
          if(i==m-1 &&j==n-1)
          {
            dp[i][j] = maze[i][j];

          }
          else if(i==m-1)
          {
            dp[i][j] =dp[i][j+1]+maze[i][j];

          }
          else if(j==n-1)
          {
            dp[i][j] = dp[i+1][j]+maze[i][j];
          }
          else{

          dp[i][j] = Math.min(dp[i+1][j],dp[i][j+1])+maze[i][j];
        }
      }
    }

    return dp[0][0];
  }
}
