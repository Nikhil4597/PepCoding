import java.util.*;
public class Any_b_to_deci{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int deci_num =0;
		int pow =1;
		while(n!=0)
		{
			int quo = n/10;
			int rem = n%10;
			deci_num = deci_num+rem*pow;
			pow =b*pow;
			n=quo;
			}
			System.out.println(deci_num);
		}
	}
