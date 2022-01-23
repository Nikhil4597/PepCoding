import java.util.*;
public class bansal{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int [] arr = new int [str.length()];
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = str.charAt(i)-'0';
        }
        System.out.println(findAns(arr));
    }
    public static String findAns(int [] arr)
    {
     char [] alphas = new char [26];
        for(int i =0;i<alphas.length;i++)
        {
            alphas[i] = (char)('a'+i);
        }
        String ansStr = "";
        for(int i=0;i<arr.length;i++)
        {
            ansStr+=alphas[arr[i]];
        }
        return ansStr;
        }
}