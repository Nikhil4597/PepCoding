import java.util.*;
public class Q_6{
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		int ans = power(x,n);
		System.out.println(ans);
		
		}
		public static int power(int x,int n)
		{
			if(n==0)
			{
				return 1;
				
				}
			int poh= power(x,n/2);//power of half 
			if(n%2==0){
			return poh*poh;
			}
			return x*poh*poh;
			}
	}
