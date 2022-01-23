import java.util.*;
public class q_18{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int spc =0;
		int str =n;
	
		
		for(int i =1;i<=n;i++)
		{
			for(int j=1;j<=spc;j++)
			{
				System.out.print("\t");
				}
				for(int k =1;k<=str;k++)
				{
					if(i>1&&i<=n/2&& k>1 && k<str)
					{
						System.out.print("\t");
						}
						else
					System.out.print("*\t");
					}
					if(i<=n/2)
					{
						str-=2;
						spc+=1;
						}
						else
						{
							str+=2;
							spc-=1;
							
							}
			
							System.out.println();
			
			}
		}
	}
	
		
