import java.util.*;
public class EndStr{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        String  str = scn.next();
        System.out.println(endStr(str));
    }
    public static String endStr(String str)
    {
        String ans ="";
        int j=str.length();

        while(j>0){
        
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                  ans = str.substring(0,i)+str.substring(i+2);
            }
            
        }
        str = ans;
        j--;
    }
    if(str.length()==0)
    {
        return "Empty String";
    }
     return str;   
    }
}