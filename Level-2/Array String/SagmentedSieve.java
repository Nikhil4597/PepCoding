import java.util.*;
public class SagmnetedSieve{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int l =0;l<t;l++)
        {
            int m = scn.nextInt();
            int n = scn.nextInt();
            int len =(int)Math.sqrt(n);
            boolean [] prime =  new boolean [len+1];
            for(int i=2 ;i*i <=len;i++)
            {
                if(prime[i] == false){
                    for(int j = i*i;j<=len;j+=i)
                    {
                        prime[j] = true;
                    }
                }
            }
            boolean [] ans = new boolean [n-m];
            for(int i =2;i<len;i++)
            {
                if(prime[i] == false)
                {
                    for(int j = ((int)Math.ceil(m*1.0/i)*i) - m;j<ans.length;j+=i)
                    {
                        ans[j] = true;
                    }
                }
            }
            for(int i = 0;i<ans.length;i++)
            {
                if(ans[i] == false)
                {
                    System.out.print(m+i+" ");
                }
            }
            
        }
                    System.out.println();
    }
}