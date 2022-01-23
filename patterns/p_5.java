import java.util.*;
public class p_5{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int spc =n/2;
		int str =1;
		for(int i =1;i<=n;i++)
		{
			for(int j =1;j<=spc;j++)
			{
				System.out.print("\t");
				}
				for(int k=1;k<=str;k++)
				{
					System.out.print("*\t");
					}
			if(i<=n/2)
			{
				spc--;
				str+=2;
				
				}
			else
			{
				spc++;
				str-=2;
				
				}
			System.out.print("\n");
			}
		}
	}
