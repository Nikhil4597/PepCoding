import java.util.*;
public class PrimeInRange{
    public static ArrayList <Integer> getPrimeInRange(int m ,int n)
    {
        ArrayList <Integer> ans = new ArrayList <>();

        for(int i =m;i<=n;i++)
        {
            if(isPrime(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
    public static boolean isPrime( int num)
    {
        if(num ==1)
        {
            return false;
        }
        for(int  i =2;i*i<= num;i++)
        {
            if(num%i ==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n  = scn.nextInt();
        ArrayList <Integer> ans = getPrimeInRange(m,n);
        System.out.println(ans);
    }
}
