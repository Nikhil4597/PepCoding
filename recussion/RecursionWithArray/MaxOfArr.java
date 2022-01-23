import java.util.*;
public class MaxOfArr
{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] =scn.nextInt();
			}
		int ans =	maxOfArray(arr,0);
			System.out.println(ans);
		}
		public static int maxOfArray(int [] arr,int idx)
		{
			if(idx == arr.length)
			{
				return -1;
				}
			int max = maxOfArray(arr,idx+1);
			return Math.max(arr[idx],max);
			}
	}
