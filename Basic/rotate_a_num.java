import java.util.*;
public class rotate_a_num{
	public static void main(String[] args ){
		Scanner scn = new Scanner(System.in);
		int  num = scn.nextInt();
		int r = scn.nextInt();
		int temp = num;
		int count =0;
while(temp!=0)
		{
			temp = temp/10;
			count++;
		}
							r = r%count;

		if(r<0)
		{
			r =count+r;

			}
		
		int div;
		int multi =num;
		
		for(int i = 0;i<r;i++)
		{
			div = num%10;
			num = num/10;
			multi = div*(int)Math.pow(10,count-1)+num;
			num =multi;
			}
			
			System.out.println(multi);
			
			} 
	}
