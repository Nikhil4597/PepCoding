import java.util.*;
public class AnyBaseMulti{
	public static void main(String [] args){
	
	Scanner scn = new Scanner(System.in);
	int b = scn.nextInt();
	int n1 = scn.nextInt();
	int n2 = scn.nextInt();
	
	int d = getProduct(b,n1,n2);
	 System.out.println(d);
	}
	public static int getProduct(int b,int n1,int n2)
	{
		int pow =1;
		int result =0;
		while(n2>0)
		{
			int qou = n2/10;
			int rem  =n2%10;
			
		
			int s_pro = getProductWithSingleDigit(b,n1,rem);
			
			 result = add(b,result,s_pro*pow);
			 pow = pow*10;
				n2 = qou;
			}
		
		return result;
		}
		public static int getProductWithSingleDigit(int b,int n1,int d2)
		{
			int carry =0;
			int pow =1;
			int pro =0;
			
			while(n1>0||carry>0)
			{
				int qou1 = n1/10;
				int rem1 = n1%10; 
				int cross = rem1 * d2+carry ;
				int qou = cross/b;
				
				int rem = cross%b;
				
				pro = pro + pow * rem ;
				pow = pow * 10;
				carry = qou;
				 
				 
				n1 = qou1;
				}
				return pro;
			}
		public static int add(int b,int num1,int num2)
		{
			int carry =0;
			int sum =0;
			int pow =1;
			
			while(num1 >0||num2>0|| carry>0)
			{
				int quo1 = num1/10;
				int rem1 = num1%10;
				
				int quo2 = num2/10;
				int rem2 = num2%10;
				
				int num3 = rem1+rem2+carry;
				int quo = num3/b;
				int rem = num3%b;
				
				sum = sum+ rem*pow;
				pow = pow*10;
				carry = quo;
				num1 =quo1;
				num2 = quo2;
				}
				return sum;
				
			}
		
		}
