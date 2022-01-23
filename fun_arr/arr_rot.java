import java.util.*;
public class arr_rot{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr  = new int[n];
		for(int  i=0;i<n;i++)
		{
			arr[i] = scn.nextInt();
			}
			int i =0;
			int j = n-1;
			
			System.out.println(arr.length);
			while(i<j)
		{
			int temp =arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
			}
			for(int k =0;k<n;k++)
			{
				System.out.println(arr[k]);
				}
		}
	}
