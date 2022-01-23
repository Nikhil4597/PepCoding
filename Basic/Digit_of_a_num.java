import java.util.*;
import java.lang.*;
public class Digit_of_a_num{
	public  static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int digi =0;
		int temp = n;
		
		while(temp!=0)
		{
			temp = temp/10;
			digi++;
			} 
			digi--;
		
			
			while(digi!=0){
				int g_num =(int)Math.pow(10,digi);
			int left_num = n /g_num;
			
			System.out.println(left_num);
			n  = n  - (left_num*g_num);
				digi--;
				}
				System.out.println(n);
		}
	}
	
