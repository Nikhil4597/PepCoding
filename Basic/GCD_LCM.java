import java.util.*;
public class GCD_LCM{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
	int rem ;
	
		int n1=  num1;
		int n2 = num2;
			while(num1%num2!=0)
			{
				rem = num1%num2;
				num1=num2 ;
				num2 = rem ;
				
				
				}
				int gcd  = num2;
				int lcm = (n1*n2)/gcd;
				System.out.println(gcd);
			System.out.println(lcm);
		}
	} 
