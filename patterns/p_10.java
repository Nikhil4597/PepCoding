import java.util.*;
public class p_10{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int spc1 =n/2; 
		int spc2 =-1; 
		
		for(int i =1;i<=n;i++)
		 
		{
			for(int j =1;j<=spc1;j++)
			{ System.out.print("\t");
				}
				
			System.out.print("*\t");
			for(int k=1;k<=spc2;k++)
			{
				System.out.print("\t");
				}
				if(i>1&&i<n)
				{
			System.out.print("*\t");}
				
			 if(i<=n/2)
			 {spc1--;
				 spc2+=2;
				 }
			else
			{
				spc1++;
				spc2-=2;
				} 
		
		System.out.println();
	}
}
	}

