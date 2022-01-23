import java.util.*;
public class BuySell1
{
    public static void main(String [] args)
    {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] stock = new int [n];
    for(int i =0;i<n;i++)
    {
        stock[i]=scn.nextInt();
    }
    System.out.println(sellbuyStock(stock));
    }
     public static int sellbuyStock(int [] stock)
    {
    int buy =Integer.MAX_VALUE;
    int sell=0;
    int j=0;
        for(int i =0;i<stock.length;i++)
        {
            if(buy>stock[i] && j>=i)
            {
            buy = stock[i];
            }
            if(sell<stock[i])
            {
            sell = stock[i];
            j =i;
            }
        }
        System.out.println(buy+" "+sell);
        
        return sell-buy<0?0:sell-buy;
    }
}
