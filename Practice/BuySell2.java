import java.util.*;
public class BuySell2
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
    int count=0;
    for(int i =0;i<stock.length-1;i++)
    {
        if(stock[i]<stock[i+1])
        {
        count+=(stock[i+1]-stock[i]);
        }
    }
    return count;
    }
}
