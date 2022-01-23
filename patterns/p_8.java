import java.util.*;
public class p_8{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int spc1 = n-1;
		int str = 1;
		int spc2 = 0;
		for(int i =1;i<=n;i++)
		{ 
			for(int j=1;j<=spc1;j++)
			{
				System.out.print("\t");
				
				}
			for(int k=1;k<=str;k++)
			{
				System.out.print("*\t");
				}
				for(int l=1;l<=spc2;l++)
				{
					System.out.print("\t");
					}
			spc1--;
			spc2++;
			if(i==n-1)
			{
				spc2=0;
				}
				System.out.println("");
			}
		}
	}
