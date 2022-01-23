import java.io.*;
import java.util.*;

public class Q_5 {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         int m = scn.nextInt();
         int [][] arr = new int [n][m];
         for(int i =0;i<n;i++)
         {for(int j =0;j<m;j++)
        {
        arr[i][j] = scn.nextInt();
        }}
        int ans = tab_mazeTravel(arr);
        System.out.println(ans);
//        int [] [] dp = new  int [n][m]; 
//        int ans  = mazeTravel(arr,0,0,dp);
//        System.out.println(ans);
    }
    public static int tab_mazeTravel(int [][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;
        int [][]dp = new int [n][m];
        for(int i = n-1;i>=0;i--)
        {
        for(int j = m-1;j>=0;j--)
        {
         if(i ==n-1 && j ==m-1)
         {
         dp[i][j] = arr[i][j];
         }
         else if(i ==n-1)
         {
         dp[i][j] = dp[i][j+1]+arr[i][j];
         }
         else  if(j ==m-1)
         {
         dp[i][j] = dp[i+1][j]+arr[i][j];
         }
         else
         { 
         dp[i][j] = Math.min(dp[i+1][j],dp[i][j+1])+arr[i][j]; }
        }
        }
        return dp[0][0]; 
    }
//    public static int mazeTravel(  int [] []arr,int r,int c,int [][]dp)
//    {
//    if(r == arr.length-1&&c== arr[0].length-1)
//    {
//    return arr[r][c];
//    }
//    if(r>= arr.length||c>=arr[0].length)
//    {
//    return Integer.MAX_VALUE;
//    }
//    if(dp[r][c]!=0)
//    {
//    return dp[r][c];
//    }
//      int ans = Math.min(mazeTravel(arr,r+1,c,dp),mazeTravel(arr,r,c+1.dp))+arr[r][c];
//        dp[r][c] =ans;
//   return ans;
//    }
}
