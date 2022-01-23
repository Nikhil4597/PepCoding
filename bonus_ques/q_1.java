import java.util.*;
public class q_1{
	public static void main(String[] args)
	{Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int ans = consecutiveNumbersSum(n);
		System.out.println(ans);
		
		}
		public static int consecutiveNumbersSum(int n){
			int temp=1;
			int count=0;
			int sum =0;
			{
				while(temp<n)
				{
					if(sum>n)
					{
						sum =0;
						count =0;
						}
						if(sum ==n)
						{
							return(count);
							}
					
						temp++;
					}
				}
			return 1;
			}
	}
