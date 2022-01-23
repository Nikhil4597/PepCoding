import java.util.*;
public class eco_broke{
	public  static void main(String[] args)
	{
		Scanner scn  =new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scn.nextInt();
			
			}
			int d = scn.nextInt();
		int  l=0;
		int  r =n-1;
		int ceil =r;
		int floor =l;
		
		while(l<=r)
		{
			int mid = l+((r-l)/2) ;
			
				  if(arr[mid]>d)
				{
					r = mid-1;
					 ceil =arr[r];
					
					}
					else if(arr[mid]<d)
					{
						l = mid+1;
						floor=arr[l];
						}
			}
			System.out.println(floor+"\n"+ceil); 
		}
	}
