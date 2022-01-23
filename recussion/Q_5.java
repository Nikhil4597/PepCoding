import java.util.*;
public class Q_5{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		int pow =power(x,n);
		System.out.println(pow);
		}
		public static int power(int x,int n)
		{
			if(n==0)
			{
				return 1;
				}
			int polo = power(x,n-1);//power of less one
			int ans =x*polo;
			return  ans;
			}
	}
