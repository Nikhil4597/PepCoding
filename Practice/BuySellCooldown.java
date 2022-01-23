import java.util.*;
public class BuySellCooldown{
public static void main(String []args)
{
Scanner scn = new Scanner(System.in);
int n =scn.nextInt();
int [] arr = new int [n];
for(int i =0;i<n;i++)
{
arr[i] =scn.nextInt();
}
System.out.println(buysell(arr));

}
    public static int buysell(int [] arr)
    {
    int ob =arr[0];
    int os =0;
    int ocd =0;
    for(int i =1;i<arr.length;i++)
    {
        int nb= Math.min(ob,arr[i]-ocd);
        int ns = Math.max(arr[i]-ob,os);
        int ncd = Math.max(os,ocd);
        ob =nb;
        os =ns;
        ocd =ncd;
    }
    return os;
    } 
}
