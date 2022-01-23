import java.util.*;
public class p_16{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int str = 1;
		
		  for(int i=n ;i>=1;i--)
		  {
			  for(int  j=1;j<=str;j++)
			  {
				  System.out.print(j+"\t");
				  
				  }
				  
				  int spc = (2*i)-3;
				  for(int l =1;l<=spc;l++)
				  {
					  System.out.print("\t");
					  }
					  if(i ==1)
					  {
						  str-=1;
						  }
						  
					  for(int m = str;m>=1;m--)
					  {
						  System.out.print( m+"\t");
						  }
						   
						 
			   str++;
					
			System.out.println();
			
			}
		}
	
}
