import java.util.*;
public class p_17{
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int str =1; 
		int spc =(n/2)+1;
		for(int i=1;i<=n;i++)
		 {
			 
			 for(int i1=1;i1<spc;i1++)
			 {
				 if(i!=(n/2)+1)
				 {
					 System.out.print("\t"); 
				 }
				 else{
				 System.out.print("*\t");
				 }
			 }
			 
			  
				 if(i<(n/2)+1)
				 {
				 for(int j =1;j<=str;j++)
				 {
					 System.out.print("*\t");
					 }
					 str++;}
					 if(i>=(n/2)+1)
					 {
						 for(int i2=1;i2<=str;i2++)
						 {
							 System.out.print("*\t");
							 
							 }
						 str--;
						 }
						 
		System.out.println();
			}
		
		}
	
	}
