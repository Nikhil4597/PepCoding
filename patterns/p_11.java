import java.util.*;
public class p_11{
	public static void main(String[] args)
	{
		Scanner scn  = new Scanner(System.in);
		
		int n = scn.nextInt();
		int num =1;
		
		for(int i = 1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
				{System.out.print(num+"\t");
					num++;
					
					}
					else 
				{
					System.out.print("\t");
					}
				}
				System.out.println();
			}
		}
	}
