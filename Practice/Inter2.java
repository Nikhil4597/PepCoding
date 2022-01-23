import java.util.*;
public class Inter2{
	public static void main(String [] args )
	{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println(findMin(a,b));
	}
	public static int  findMin(int a,int b)
	{
		int count1way =0;
		int count2way =0;
		int count3way =0;
		count1way =helper(a,b,a/2,0);
		count2way =helper(a,b,b/2,0);
		count3way = helper(a,b,(int)Math.floor(Math.sqrt(a*b)),0);
		return Integer.min(count1way+1,(int)Math.min(count2way+1,count3way+2));
	}
	public static int helper(int a,int b,int ra,int cost)
	{
		if(a==0  && b==0  && ra==0)
		{
			return cost;

		}
		int count1way =helper(a/2,b,a/2,cost+1);
		int count2way =helper(a,b/2,b/2,cost+1);
		
	int count3way = helper(a,b,(int)Math.floor(Math.sqrt(a*b)),2);
		return Integer.min(count1way,Math.min(count2way,count3way));
}}
