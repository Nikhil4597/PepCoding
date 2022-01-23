import java.io.*;
import java.util.*;

public class SNFP{


public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    getPattern(str);
 }
 public static void getPattern(String str)
 { Stack <Integer> st = new Stack<>();
   int count =1;
   for(int i =0;i<str.length();i++)
   {
     char ch = str.charAt(i);

     if(ch =='d'){
       count++;
       st.push(count);
     }
     else if(ch=='i')
     {
       count++;
       st.push(count);
       while(st.size()>0)
       {
         System.out.print(st.pop());
       }
     }
   }

     count++;
     st.push(count);
     while(st.size()>0)
     {
       System.out.print(st.pop());
     }
 }
}
