import java.util.*;
public class StateOfWakanda{
	public static void main(String[] args)
	{
			Scanner scn =new Scanner(System.in);
			int n = scn.nextInt();
			int [][] arr =new int[n][n];
			for(int i =0;i<n;i++)
			{
				for(int j =0;j<n;j++)
				{
					arr[i][j] = scn.nextInt();
					
					}
				}
				diagonalEle(arr);
		}
		public static void diagonalEle(int [][] arr)
		{
			int n =arr.length;
			for(int k =0;k<n;k++){
			for(int i =0;i<n;i++)
			{
				for(int j =0;j<n;j++)
				{
					if(i==j-k){
				System.out.println(arr[i][j]);
			}
				}
		}
	}
		}
	}
