import java.util.*;
public class RotateBy90{
	public static void main(String[] args)
{
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int [][] arr = new int [n][n];
	for(int i =0;i<n;i++)
	{
	for(int j =0;j<n;j++)
	{
		arr[i][j] = scn.nextInt();
		
		}
		
	}
	Rotate_per(arr);
	display(arr);
	
	}
	public static void display(int [][] arr)
	{
		int n = arr.length;
		
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
				
				}
				System.out.println();
			}
		}
		public static void Rotate_per(int [][] arr)
		{
			transpose(arr);
			col_inver(arr);
			}
			public static void transpose(int [][] arr)
			{
				int n =arr.length;
				for(int i =0;i<n;i++){
				for(int j=i;j<n;j++)
				{
					int temp =arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] =temp;
					}}
				}
				public static void col_inver(int [][]arr)
				{
					int n = arr.length;
					int low =0;int high =n-1;
					while(low<high)
					{
						for(int i =0;i<n;i++)
						{
							int temp = arr[i][low];
							arr[i][low] = arr[i][high];
							arr[i][high] = temp;
							}
							low++;
							high--;
						}
					}
	}
