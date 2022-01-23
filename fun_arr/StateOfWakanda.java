import java.util.*;
public class StateOfWakanda{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int col = scn.nextInt();
		int [][] arr = new int [row][col];
		for(int i =0;i<row;i++)
		{
			for(int j =0;j<col;j++)
			{
				arr[i][j] =scn.nextInt();
				}
			}
		SoW(arr);	
		}
		public static void SoW(int [][]arr)
		{
			int r = arr.length;
			int c = arr[0].length;
			for(int i =0;i<c;i++)
			{
				if(i%2==0)
				{for(int j=0;j<r;j++)
				{
					System.out.println(arr[j][i]);
					}}
					else
					{for(int j =r-1;j>=0;j--)
						{
							System.out.println(arr[j][i]);
							
							}}
				}
				 
				 
			}
			 
	}
