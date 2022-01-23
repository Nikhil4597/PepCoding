import java.util.*;
public class NextGreaterElement{
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int [n];
		for(int i =0;i<n ;i++)
		{
			arr[i] = scn.nextInt();
			
			}
			int [] ans = findAns(arr);
			for(int i =0;i<ans.length;i++)
			{
				System.out.println(ans[i]);
				}
	}
	public static int [] findAns(int [] arr)
	{
		int n = arr.length;
		
		int [] ans  = new int  [n];
		ans[n-1] =-1;
		Stack <Integer> st = new Stack<>();
		st.push(arr[n-1]);
		for(int i =n-2;i>=0;i--)
		{
			while(st.size()>0 && st.peek()<=arr[i])
			{
				st.pop();
				}
				if(st.size()==0)
				{
					ans[i]=-1;
					}
					else
					{
						ans[i] = st.peek();
						}
							st.push(arr[i]);
			}
			
			return ans;
		}
	}
