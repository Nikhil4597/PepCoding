import java.util.*;
public class SumofSqr{
    public static boolean judgeSquareSum(int c)
    {
        for(int a =0;a<=Math.sqrt(c);a++)
        {
            double  b = Math.sqrt(c-a*a);
            if(b == (int)b)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int c = scn.nextInt();
        System.out.println(judgeSquareSum(c));
    }
}