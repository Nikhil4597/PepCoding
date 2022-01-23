import java.util.*;
public class Any_b_to_any_b{
	public static  void main(String[] args)
	{ 
		Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int deci_num =0;
	int pow =1;
	
     while(n!=0)
     {
		int quo = n/10;
		int rem = n%10;
		deci_num = deci_num+rem*pow;
		pow = sourceBase*pow;
		n = quo; 
		 }
		  n=0;
		  pow =1;
		  while(deci_num!=0)
		  {
			  int quo = deci_num/destBase;
			  int rem = deci_num%destBase;
			  n=n+rem*pow;
			  pow = pow*10;
			  deci_num = quo;
			  }
			  System.out.println(n);
		}
	}
