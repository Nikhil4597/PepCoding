import java.io.*;
import java.util.*;

public class Q_4 {
 public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++)
        {
        arr[i] = scn.nextInt();
        }
//        int [] dp = new int [n];
//        int ans =stairPathMin(0,arr,dp);
//        System.out.println(ans);
int ans = tar_stairPath(arr);
System.out.println(ans);
    }
    //recursive
public static int stairPathMin(int n , int [] arr,int [] dp)
{
if(arr.length == n)
{
return 0;
}
if(dp[n]!=0)
{return dp[n];
}
int min = Integer.MAX_VALUE;
for(int i =1;i<=arr[n] && n+i<= arr.length;i++)
{
int minPath =stairPathMin(n+i,arr,dp);
if(min>minPath)
{
min = minPath;
}
}
if(min == Integer.MAX_VALUE)
{
dp[n] =min;
return min;
}
dp[n] = min+1;
return min+1;
}

//dp
public static int tar_stairPath(int [] arr)
{
int n = arr.length;
int [] dp = new int [n+1];
dp[n] = 0;
for(int i =n-1;i>=0;i--)
{ int min = Integer.MAX_VALUE;
 
for(int j =1;j<=arr[i]  && j+i<=n ;j++)
{
if(min>dp[i+j])
{
min = dp[i+j];
}
}
if(min==Integer.MAX_VALUE){
dp[i] = min;
}
else 
{
dp[i] = min+1;
}
}
//for(int i =0;i<n+1;i++)
//{
//System.out.println(dp[i]);
//}
return dp[0]; 
}
}
