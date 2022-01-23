import java.util.*;
public class BSearch{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] = scn.nextInt();
			}
			int d =scn.nextInt();
			
			
			int result=B_Search(arr,d);
			System.out.println(result);	
		}
		public static int B_Search(int [] arr,int d)
		{
			 int l=0;
			 int h= arr.length-1;
			 while(l<=h)
			 {
				 int mid = l+((h-l)/2);
				 if(arr[mid] ==d)
				 {
					 return mid; 
				 }
				 else if(arr[mid]>d)
				 {
					 h =mid-1;
					 }
					 else if(arr[mid]<d)
					 {
						 l =mid+1;
						 }
						 
			 }
			 return -1;
			}
	}
