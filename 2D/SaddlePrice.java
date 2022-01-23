import java.util.*;
public class SaddlePrice{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [][] arr =new int[n][n];
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j] = scn.nextInt();
				
				}
			}
			int ans = saddlePrice(arr);
			if(ans==-1)
			{
				System.out.println("Invalid input");
			}
				else
				{
					System.out.println(ans);
					}
				}
		
		public static int saddlePrice(int [][] arr)
		{
			int n = arr.length;
			for(int i =0;i<n;i++)
			{
				int min = arr[i][0];
				int idx =0;
				for(int j =0 ;j<n;j++)
				{
					if(arr[i][j]<min)
					{
						min = arr[i][j];
						idx =j;
						}
					}
					int temp = min;
					for(int k =0 ;k<n;k++)
					{
						if(arr[k][idx]>temp)
						{
							temp = arr[k][idx];
							break;
							}
							
						}
						if(temp == min)
						{
							return min;
							}
				}
				return -1;
				
			}
	}
