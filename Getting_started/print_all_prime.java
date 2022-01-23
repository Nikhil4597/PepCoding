import java.util.*;
public class print_all_prime{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int low_range = scn.nextInt();
		int high_range = scn.nextInt();
		for(int i = low_range;i<= high_range;i++)
		{
			if(Is_num_prime(i) ==0)
			System.out.println(i);
			
			}
		}
		    static int Is_num_prime(int num){
			int count =0;
			for(int j =2;j*j<=num;j++)
			{
				if(num%j==0)
				{count++;
					break;
					}
					
				}
				return count;
			}
	}
