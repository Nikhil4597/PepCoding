import java.util.*;
public class FirstLastIndex{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]= scn.nextInt();
			
			}
			int d = scn.nextInt();
	F_L_Index(arr,d);
}
public static void F_L_Index(int [] arr,int d)
{
	int l  = 0;
	int h  = arr.length -1;
	
	int F_idx = -1;
	int L_idx  = -1;
	while(l<=h)
	{
		int mid = l+((h-l)/2) ;
		
		if(arr[mid] == d)
		{
			if(arr[mid-1]!= d || mid == arr.length-1)
			{
				F_idx = mid;
				break;
				}
				else
				{
					h =mid-1;
					}
			}
			else if(arr[mid]>d)
			{
				h =mid -1;
				
				} 
				else if(arr[mid]<d)
				{
					l = mid +1;
					}
		}
		if(F_idx == -1)
		{
			l=0;
			
			}
			else{
				l = F_idx;
				}
				h = arr.length-1;
		while(l<=h)
		{
			int mid = l+((h-l)/2);
			if(arr[mid] == d)
			{
				if(arr[mid+1]!=d || mid == arr.length-1 )
				{
					L_idx = mid;
					break;
					}
					else 
					{
						l =  mid+1;
						}
				}
				else if(arr[mid]>d)
				{
					h =mid-1;
					
					}
					else {
						l = mid+1;
						}
			}
	System.out.println(F_idx+" "+L_idx);
	}
}
