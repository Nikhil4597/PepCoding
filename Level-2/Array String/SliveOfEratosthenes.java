import java.util.*; 
public class SieveOfEratosthenes{
    public static void  getPrimeInRange(int n)
    {
       boolean  [] prime = new boolean [n+1];
       for(int i = 2;i*i<=n;i++)
       {
           if(prime[i] == false)
           {
                for(int j = i*i;j<=n;j+=i)
                {
                    prime[j] = true;
                }
           }

       }

       for(int i = 2;i<=n;i++)
       {
           if(prime[i] == false)
           {
               System.out.println(i+" ");
           }
       }
       System.out.println();
    }
     public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
         getPrimeInRange(n); 
    }
}