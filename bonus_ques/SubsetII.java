import java.util.*;
public class SubsetII{
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		int n =scn.nextInt();
		int [] arr =new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] = scn.nextInt();
			}
		ArrayList <Integer> list =subsetsWithDup(arr);
		System.out.print(list);
		
		}
		public static ArrayList<Integer>subsetsWithDup(int [] nums)
		{
			int n = nums.length-1;
			
				ArrayList <Integer> half =subsetsWithDup(nums[n-1];
				ArrayList<Integer> ans =
				
			}
	}
