import java.util.*;
public class rotate_arr{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int  [] arr = new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scn.nextInt();
			
			}
			int d = scn.nextInt();
			rotate(arr,d);
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]);
				}
		
		}
		public static void reverse(int [] a,int sp,int ep){
			while(sp<ep)
			{
				int temp = a[sp];
				a[sp] =a[ep];
				a[ep] = temp;
				sp++;
				ep--;
				
				}
				
			
						}
		public static void rotate(int [] a,int k){
			   k= k % a.length;
			if(k<0)
			{
				k = a.length-k;
				}
			 reverse(a,0,a.length-1);
			 reverse(a,0,k-1);
			 reverse(a,k,a.length-1);
			
			}
	}
