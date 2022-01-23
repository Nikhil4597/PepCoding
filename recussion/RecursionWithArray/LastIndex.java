import java.util.*;
public class LastIndex{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr =new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] = scn.nextInt();
			
			}
			int x = scn.nextInt();
			int ans =lastIndex(arr,0,x);
			System.out.println(ans);
		}
		public static int lastIndex(int [] arr,int  idx,int x)
		{if(idx==arr.length)
			{
				return idx-1;
				}
			int ans =lastIndex(arr,idx+1,x);
			if(arr[ans]!=x)
			{
				return ans-1;
			}
			
			//if(arr[ans]!=x)
			//{
				//return -1;
				
				//}
				//else if(arr[ans]==x)
				//{
					return ans;
					
			}
	}
