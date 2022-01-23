import java.util.*;
public class StairCaseWithMiniMoves{
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] =scn.nextInt();
			}
			Integer [] minWays = new Integer[n+1];
			minWays[n] =0;
				for(int i=n-1;i>=0;i--)
				{
					if(arr[i]>0){
						int mini =Integer.MAX_VALUE;
						
					for(int j =1;j<=arr[i]&&i+j<n+1;j++)
					{
						if(minWays[i+j]!=null){
						mini = Math.min(mini,minWays[i+j]);
						
						}
						}
						if(mini !=Integer.MAX_VALUE)
						{
							minWays[i] =mini+1;
							}
							else
							{
								minWays[i]=null;
								}
						}
					}
					
					//for(int i =0;i<minWays.length;i++)
					//{
						//System.out.println(minWays[i]);
						//}	
						System.out.println(minWays[0]);
						
		}
	}
