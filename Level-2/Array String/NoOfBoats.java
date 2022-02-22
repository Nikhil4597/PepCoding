import java.util.*;
public class NoofBoats{
	public static int numRescueBoats(int  [] people,int limit)
	{
		int count=0;
		int rest =limit;
		for(int i =0;i<people.length-1;i++)
		{
			rest-=people[i];
			if(rest<0)
			{
				rest =limit;
				count++;
			}
		}
		return count;

	}
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int [n];
		for(int i =0;i<n;i++)
		{
			arr[i] = scn.nextInt();
		}
		int limit  = scn.nextInt();

		System.out.println(numRescueBoats(arr,limit));
	}
}