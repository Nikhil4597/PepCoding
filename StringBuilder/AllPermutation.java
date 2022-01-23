import java.util.*;
public class AllPermutation{
public static void main(String[] args)
{
	Scanner scn =new Scanner(System.in);
	String str = scn.next();
	solution(str);
	}
	public static void solution(String str)
	{
		int n =str.length();
		int nop = factorial(n); //no of permutation
		for(int i=0;i<nop;i++)
		{
			StringBuilder cstr= new StringBuilder(str);
			int temp =i;
			for(int j=n;j>0;j--)
			{
				int quo = temp/j;
				int rem =temp%j;
				System.out.print(cstr.charAt(rem));
				cstr.deleteCharAt(rem);
				temp =quo;
					
				}
				System.out.println();
				
			}
		}
	public static int factorial(int n)
	{
		int fact =1;
		for(int i =2;i<=n;i++)
		{
			fact = fact*i;
			}
			return fact;
		}
		
}
