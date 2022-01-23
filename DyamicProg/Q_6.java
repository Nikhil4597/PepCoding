import java.util.*;
public class Q_6{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int m = scn.nextInt();
int [][] arr = new int[n][m];
//int [][] dp = new int [n][m];
for(int i =0;i<n;i++)
{
for(int j =0;j<m;j++)
{
arr[i][j] = scn.nextInt();
}
}
int ans = tar_maxGold(arr);
System.out.println(ans);
//int ans  = Integer.MIN_VALUE;
//for(int i =0;i<n;i++)
//{
//int max = maxGold(arr,i,0);
//if(max>ans)
//{
//ans = max;
//}
//}

}
public static int  tar_maxGold(int [][] arr )
{
int n = arr.length;
int m = arr[0].length;
int [][] dp = new int [n][m];
for(int j =m-1;j>=0;j--)
{
for(int i =n-1;i>=0;i--)
{
if(j ==m-1)
{
dp[i][j] = arr[i][j];
}
else if(i==0)
{
dp[i][j] = Math.max(dp[i][j+1],dp[i+1][j+1])+arr[i][j];
}
else if (i ==n-1)
{
dp[i][j] = Math.max(dp[i][j+1],dp[i-1][j+1])+arr[i][j];
}
else 
{
dp[i][j]= Math.max(Math.max(dp[i][j+1],dp[i-1][j+1]),dp[i+1][j+1])+arr[i][j];
}
}
}
int ans = Integer.MIN_VALUE;

for(int i =0;i<n;i++)
{
if(ans<dp[i][0])
{ans=dp[i][0];}
}
return ans;
}
//public static int maxGold(int [][] arr,int r,int c)
//{
//if(r<0||r>=arr.length)
//{
//return Integer.MIN_VALUE;
//}
//if(c==arr[0].length-1)
//{
//return arr[r][c];
//}
//int ans1 =maxGold(arr,r-1,c+1);
//int ans2 = maxGold(arr,r+1,c+1);
//int ans3 =  maxGold(arr,r,c+1);
//int ans = Math.max(Math.max(ans1,ans2),ans3)+arr[r][c];
//return ans;
//}
// 
}
