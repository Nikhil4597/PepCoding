import  java.util.*;
public class error{
    public static  void main(String [] arsgs)
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(findError(str));
    }
    public static int findError(String str)
    {
        int count =0;
        for(int i =0;i<str.length();i++)
        {
         char   ch  = str.charAt(i);
         if(ch >= 'a' && ch <='z')
         {
             count++;

         }   
        }
        return str.length()-count;
    }}


