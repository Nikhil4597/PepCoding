import java.util.*;
public class Q_1{
	public static void main(String[] args){
		Scanner scn =new Scanner(System.in);
		int n = scn.nextInt();
		printDecresing(n);
		}
		public static void printDecresing(int n)
		{
			if(n==0)
			{
				return ;
				
				}
			
			printDecresing(n-1);
			System.out.println(n);
			
		}
	}
	
