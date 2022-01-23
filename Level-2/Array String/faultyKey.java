//two pointer concept
import java.util.*;
public class faultyKey{
    public static boolean isLongPressedName(String name,String typed)
    {
                 int i =0;
        int nlen = name.length();
        int tlen = typed.length();
        for(int j =0;j<tlen;j++)
        {
            if(i<nlen && name.charAt(i) == typed.charAt(j))
            {
                i++;
            }
            else if(j == 0 || typed.charAt(j) != name.charAt(i-1)){
                return false;
            }
            
        }
        return i==nlen;  
    }
    public static void main(String []  args )
    {
        Scanner scn = new Scanner(System.in);
        String name  = scn.next();
        String typed = scn.next();
        System.out.println(isLongPressedName(name,typed));
    }
}