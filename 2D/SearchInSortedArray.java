import java.util.*;
public class SearchInSortedArray{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n  = scn.nextInt();
		int [][] arr = new int [n][n];
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				arr[i][j] =scn.nextInt();
				
				}
			}
			int d = scn.nextInt();
			
			searchForElement(arr,d);
		}
		public static void searchForElement(int[][] arr,int d)
		{
			int n = arr.length;
			int i =0;
			int j =n-1;
			
			while(i<n&&j>=0)
			{
				if(arr[i][j]==d)
				{
					System.out.println(i+"\n"+j);
					return ;
					}
					else if(arr[i][j]>d)
					{
						j--;
						}
						else 
						{
							i++;
							}
				}
			
			System.out.println("Not Found");
	}
}
//Time Complexcity =O(logn);
//Space Complexcity =O(1);
