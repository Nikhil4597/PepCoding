import java.io.*;
import java.util.*;

public class PrintKpc {
	static String [] arr ={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) throws Exception {
	Scanner scn =new Scanner(System.in);
	String str =scn.next();
	printKPC(str,"");
    }

    public static void printKPC(String str, String asf) {
       if(str.length()==0)
       {
		   System.out.println(asf);
		   return;
		   }
        char ch =str.charAt(0);
        String ros = str.substring(1);
        String key = arr[ch-'0'];
        for(int i =0;i<key.length();i++)
        {
			printKPC(ros,asf+key.charAt(i));
			}
    }

}
