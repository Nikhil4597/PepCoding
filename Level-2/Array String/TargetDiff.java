import java.util.*;
public class TargetDiff{
	public static boolean findPair(int [] arr ,int tar)
	{
		Arrays.sort(arr);
		int i =0, j =0;
		int n = arr.length;
		while(i<n && j<n)
		{
			int val = arr[j] - arr[i];
			if(val == tar)
			{
				return true;
			}
			else if(val<tar){
				j++;
			}
			else if(val>tar)
			{
				i++;
			}
		}
		return false;
	}
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int [n];
		for(int i =0;i<n;i++)
		{
			arr[i] = scn.nextInt();
		}
		int tar = scn.nextInt();
		System.out.println(findPair(arr,tar));
	}
}