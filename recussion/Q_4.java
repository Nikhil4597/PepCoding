import java.util.*;
public class Q_4{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int fact = factorial(n);
		System.out.println(fact);
		}
		public static int factorial(int n)
		{
			if(n==0||n==1)
			{
				return 1;
				
				}
			int prefact =factorial(n-1);
			return n*prefact;
			}
	}
