import java.util.*;
public class reverse_num{
	public static void main(String[] args )
	{
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		int temp = num;
		int count =0;
		while(temp!=0)
		{
			temp = temp/10;
			count++;
			}
			count--;
			System.out.println(count);
		while(count!=0)
		{
			int rem = num%10;
			System.out.println(rem);
			  num  = num/10;
			
			count--;
			
			}
			System.out.println(num);
		}
	
	}
