import java.util.*;
import java.lang.*;
public class Count_digi{
public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	 int num = scn.nextInt();  
	 int digi =0;
	 while(num!=0)
	 {
		 num = num/10;
		 digi++;
		 }
		 System.out.println(digi);
	}
	
}
