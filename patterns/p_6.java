import java.util.*;
public class p_6{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int str =n/2+1;
		int spc =1;
		for(int i = 1;i<=n;i++)
		{
			
			for(int k = 1;k<=str;k++)
			{
				System.out.print("*\t");
				}
				for(int j =1;j<=spc;j++)
				{
					System.out.print("\t");
					}
					
			for(int k = 1;k<=str;k++)
			{
				System.out.print("*\t");
				}
			if(i<=n/2)
			{
				spc+=2;
				str--;
				
			
				}
				else
				{
					spc-=2;
					str++;
					}
		System.out.print("\n");
			}
			
		}
	}
	
