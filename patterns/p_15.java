import java.util.*;
public class p_15{
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		int n = scn.nextInt();
		int spc  =  n/2 ;
		int str = 1;
	 
		int num=1;
		
		for(int  i =1 ;i<=n;i++)
		{
			for(int j =1;j<=spc;j++)
			{
				System.out.print("\t");
				}
			int  cval =num; 
				for(int k =1;k<=str;k++)
				{
					System.out.print(cval+"\t");
					if(k<=str/2)
					cval++;
						else {
							cval--;
							}	 
					
					}
				
			if(i<=n/2)
			{
				spc--;
				str+=2;
				num++;
				}
				else {
				spc++;
				str-=2;
				num--;
			}
			
			System.out.println();
			}
		}
	}
