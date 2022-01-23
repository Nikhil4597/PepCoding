import java.util.*;
public class Inverse{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr  = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scn.nextInt();
			
			}
		
			inverse(arr);
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]);
				}
		}
		public static void inverse(int [] a)
		{
			int [] copy = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			copy[i]=a[i];
			
			}
			for(int i=0;i<a.length;i++)
			{
				int val = copy[i];
				a[val] = i; 
				}
			}
	}
