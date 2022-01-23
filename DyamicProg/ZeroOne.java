import java.util.*;
public class ZeroOne{
public static void main(String [] args)
{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] val = new int [n];
		for(int i =0;i<n;i++){
				val[i]= scn.nextInt();
		}
		int [] wgt = new int [n];
		for(int i =0;i<n;i++){
				wgt[i]= scn.nextInt();
		}
		int cap = scn.nextInt();

		System.out.println(findMax(val,wgt,cap));
}
public static int findMax(int [] val,int [] wt,int cap)
{
		int n = val.length;
		int [][]dp = new int [n+1][cap+1];
		for(int i =1;i<dp.length;i++){
				for(int j =1;j<dp[0].length;j++){
						if(wt[i-1]>j)
						{
								dp[i][j] = dp[i-1][j];
						}
						else if(wt[i-1]<=j)
						{
								int rr =j - wt[i-1];//rest run
										if(dp[i-1][rr]+val[i-1]>dp[i-1][j])
										{
												dp[i][j] = dp[i-1][rr]+val[i-1];
										}
										else
										{
												dp[i][j]= dp[i-1][j];
										}
						}
					}
		}
		
		return dp[n][cap];
}
}			


