import java.util.*;
public class unbounded{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] val = new int [n] ;
        int [] wt  = new int [n];
        for(int i =0;i<n;i++)
        {
		val[i] = scn.nextInt();
        }
	for(int j =0;j<n;j++)
	{
		wt[j]  = scn.nextInt();

    }
    int cap = scn.nextInt();
    System.out.println(findMax(val,wt,cap));
}
public static int findMax(int [] val,int [] wt,int cap)
{
	int n = wt.length;
	int dp[] = new int [cap+1];
	for(int i =1;i<=cap;i++)
	{
		int max = 0;
		for(int j =0;j<n;j++)
		{
			if(wt[j]<=i)
			{
				int rimcap= i-wt[j];
				int rimval = dp[rimcap];
				int trimval = rimval+val[j];
				max = Math.max(max,trimval);
			}
		}
		dp[i]=max;
	}
	return  dp[cap];
}
}
