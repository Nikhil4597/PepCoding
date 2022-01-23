import java.util.*;
public class DisplayArray{
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int [n];
		for(int i =0;i<n;i++)
		{
			arr[i] =scn.nextInt();
			}
		displayArr(arr,0);
		displayArr2(arr,arr.length-1);
		}
		public static void displayArr(int [] arr,int idx)
		{
			if(idx==arr.length)
			{
				return;
				}
			System.out.println(arr[idx]);
			idx++;
			displayArr(arr,idx);
			
			}
			public static void displayArr2(int [] arr,int idx)
		{
			if(idx == -1)
			{
				
				return;
				
				}
				
				displayArr2(arr,idx-1);
				System.out.println(arr[idx]);
			}
	}
