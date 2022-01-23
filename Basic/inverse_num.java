import java.util.*;
public class inverse_num{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int num =scn.nextInt();
		int count = 0;
		int temp = num;
		
		 int temp2 =1;
			int inv =0;
			int rem;
			while(num!=0)
			{
				rem = num%10;
				
				inv = inv+(temp2*(int)Math.pow(10,rem-1));
				temp2++;
				
				num = num/10;
				
				}
				System.out.println(inv);
		} 
	}
