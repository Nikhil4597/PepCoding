import java.util.*;
public class StairPath{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n+1] ;
		int result =noOfPath(n,arr);
		System.out.println(result);


		}
		public static int noOfPath(int n,int[] arr)
		{
			if(n==0)
			{
					return 1;
				}
				if(n<0)
				{
					return 0;
					}
					int tnp =0;
					if(arr[n]!=0)
					{
						return arr[n];
						}
				for(int i =1;i<=3;i++)
				{
					tnp =tnp+noOfPath(n-i,arr);
					}
					arr[n] = tnp;
					return tnp;
			}
	}
