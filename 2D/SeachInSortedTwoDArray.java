import java.util.*;
public class  SeachInSortedTwoDArray{ 
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int m =scn.nextInt();
		int n =scn.nextInt();
		int [][] arr = new int [m][n];
		for(int i =0 ;i<m;i++)	
		{
			for(int j =0;j<n;j++)
			{
				arr[i][j] = scn.nextInt();
				
				}
			}
		//element for searching	
		int d = scn.nextInt();
			boolean found = search(arr,d);
			System.out.println(found);
			}
			
		  public static boolean search(int[][]matrix,int target) {
         int pr = findRow(matrix,target);
         if(pr==-1)
         {
			 return false;
			 }
		
		boolean ans =findElement(matrix,target,pr);
        
        return ans;
    }
    public static boolean findElement(int [][] matrix,int target,int row)
    {
		
		int n = matrix[0].length;
		
		int l =0;
		int r = n-1;
		while(l<r)
		{
			int mid =l+((r-l)/2);
			if(matrix[row][mid]==target)
			{
				return true;
				
				}
				else if(matrix[row][mid]>target)
				{
					r = mid-1;
					
					}
					else if(matrix[row][mid]<target)
					{
						l = mid+1;
						}
			}
			return false;
		}
    public static int findRow(int [][] arr,int d)
    {
		int l =0;
		int r = arr.length-1;
		int ep =arr[0].length-1;
		
         while(l<=r)
         {
			 int mid = l+((r-l)/2);
			 
			 if(arr[mid][0]<=d && arr[mid][ep]>=d)
			 {
				 return mid;
				 
				 }
				 else if(arr[mid][0]>d)
				 {
					 r = mid-1;
					 }
					 else if(arr[mid][0]<d)
					 {
						 l =mid+1;
						 }
			 }
			 
		 return -1;
	}
}
