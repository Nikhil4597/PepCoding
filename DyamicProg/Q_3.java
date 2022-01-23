import java.util.*;
public class Q_3{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int [] arr = new int[n];
for(int i =0;i<n;i++)
{
arr[i] = scn.nextInt();
}
//int []ways = new int [n];
int ans = tar_stairPath(n,arr);
System.out.println(ans);
//for(int i =0;i<n;i++)
//{System.out.print(ways[i]+" ");
//}
}
//public static int stairPath(int n,int [] arr,int [] ways)
//{
//        if(n==arr.length-1)
//        {return 1;
//        }
//        if(n>=arr.length)
//        {
//        return 0;
//        }
//        if(ways[n]!=0)
//        {return arr[n];}
//        int ans=0;
//        for(int i =1;i<=arr[n];i++)
//        {
//         ans+=stairPath(n+i,arr,ways);
//        }
//        ways[n] =ans;
//        return ans;
//}
public  static int tar_stairPath(int n,int [] arr )
{
int [] dp = new int[n+1];
dp[n] =1;
for(int i = n-1 ;i>=0;i--)
{ int sum =0;
for(int j=1;j<=arr[i] && i+j<=n;j++)
{

sum+=dp[i+j];
System.out.print(sum+" ");
}
System.out.println();
dp[i] =sum;
System.out.println(dp[i]);
}
return dp[0];
}
}
