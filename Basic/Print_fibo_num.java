import java.util.*;
 public class Print_fibo_num{
	 public  static void main(String[] args)
	 {
		 Scanner scn = new Scanner(System.in);
		 int  n = scn.nextInt();
		 int n1 = 0;
		  int n2 = 1 ;
		  if(n ==1)
		  {
			  System.out.println(n1);
	  }
		  System.out.println(n1);
		  System.out.println(n2);
		 
		 for(int i = 2;i<n;i++){
			 
		  int sum = n1+n2;
		  System.out.println(sum);
		  n1 = n2 ;
		  n2 = sum;
			 }
		 }
	 } 
