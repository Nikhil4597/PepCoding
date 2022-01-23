import java.util.*;
public class prime_fact{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int small_num = 2;
		while(num !=1)
		{
			if(num%small_num==0)
			{
				System.out.println(small_num);
				num = num/small_num;
				}
				else
				{
					small_num++;
					}
			}
		
		}
	}
