import java.util.*;
public class spiral{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int [] [] arr = new int[n][m];
		for(int i =0;i<n;i++)
		{for(int j =0;j<n;j++)
			arr[i][j] = scn.nextInt();
			
			}
			show_sprial(arr);
			
		}
		public static void show_sprial(int [] [] arr)
		{
			int row = arr.length;
			int col = arr[0].length;
			int tne = row*col;//total no of element
			int esf =0;//element so far
			rs =0;
			cs =0;
			re =row-1;
			ce = col-1;
			
			while(esf<tne)
			{
				for(int i =rs;i<=re;i++ )
				{
					System.out.println(arr[i][cs]);
					esf++;
					
					}
					cs++;
						
				for(int j =cs;j<=ce;j++)
				{
					System.out.println(arr[re][j]);
					esf++;
					}
					re--;
				for(int i = re;i<=rs;i++)
				{
					System..out.println(arr[][]);
					}
				
				}
			
			}
	}
