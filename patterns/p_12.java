import java.util.*;
public class p_12{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int num1 =0;
		int num2 =1;
		int sum;
		
		 for(int i =1;i<=n ;i++){
			for(int j=1;j<=i;j++)
			{ sum =num1+num2;
				 System.out.print(num1+"\t");
					 num1 = num2;
					 num2 = sum;
					
						}
		
		System.out.println();
		}
	}
	}

