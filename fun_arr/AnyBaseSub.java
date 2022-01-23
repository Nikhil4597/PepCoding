import java.util.*;
public class AnyBaseSub{
	public static void main(String[] args){
		Scanner  scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
	int result =	DiffInBase(b,n1,n2);
	System.out.println(result);
	}
	public static int  DiffInBase(int b,int n1,int n2)
	{
		int  carry =0; 
		int sub =0;
		int pow=1;
		int diff =0;
		while(n2>0)
		{
			int num1 =n1/10;
			int num2 = n2/10;
			
			int rem1 =n1%10;
			int rem2 =n2%10;
			
			int num3 =rem2 -rem1+carry;
			if(num3>=0)
			{
				sub = num3;
				carry =0;
				
				}
				if(num3<0)
				{
					
					sub = b+num3;
				carry  = -1;
					
					}
					diff = diff+sub*pow;
			pow = pow*10;
			n1 = num1;
			n2 =num2;
			
			}
			
			return diff;
		}
	}
