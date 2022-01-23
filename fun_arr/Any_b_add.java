import java.util.*;
public class Any_b_add{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1=  scn.nextInt();
		int n2 = scn.nextInt();
		int carry=0;
		int pow =1;
		int result =0;
		while(n1>0||n2>0||carry>0)
		{
			int num1 =n1%10;
			int num2 =n2%10;
			int sum = num1+num2+carry;
			int quo = sum/b;
			int rem =sum%b;
			result = result+rem*pow;
			pow = pow*10;
			carry =quo;
			n1 =n1/10;
			n2 =n2/10;
			}
			System.out.println(result);
		}
	}
