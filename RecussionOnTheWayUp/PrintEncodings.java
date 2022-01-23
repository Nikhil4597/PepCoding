import java.io.*;
import java.util.*;

public class PrintEncodings {

    public static void main(String[] args) throws Exception {
	
	Scanner scn = new Scanner(System.in);
	String str = scn.next();
	printEncodings(str,"");
    }

    public static void printEncodings(String str,String ans) {
       if(str.length() ==0)
       {
		   System.out.println(ans);
		   return;
		   }
		char ch =str.charAt(0);
           
		   if(ch=='0')
		   {
			   return;
			   }
		
        {	String ros = str.substring(1);
			char left =(char)(ch-'0'+'a'-1);
			printEncodings(ros,ans+left);
	}
        if(str.length()>=2)
       { char ch1= str.charAt(0);
        char ch2 =str.charAt(1);
        int n1 =ch1-'0';
        int n2 = ch2-'0';
    
        int val = n1*10+n2;
	
        if(val<=26)
        {char chr =(char)('a'+val-1);
        String ros1 = str.substring(2);
        printEncodings(ros1,ans+chr);
    }
}
    
    }

}
