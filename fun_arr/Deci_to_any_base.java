import java.util.*;
public class Deci_to_any_base{
	public  static void main(String[] args )
	{
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int base  = scn.nextInt();
		int base_num =0;
		 
		int pow =1;
		while(num!=0)
		{
			int quo = num/base;
			int rem = num%base;
			base_num = base_num+rem*pow;
			pow = pow*10;
			
			num = quo;
			}
			System.out.println(base_num);
		}
	}
