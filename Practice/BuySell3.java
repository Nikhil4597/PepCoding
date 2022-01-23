import java.util.*;
public class BuySell3{
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int [] arr = new int [n];
for(int i=0;i<n;i++)
{
arr[i]=scn.nextInt();
}
int tax = scn.nextInt();    
System.out.println(buysellStock(arr,tax));
}
public static int buysellStock(int [] arr ,int tex)
{
    int ob =arr[0];
    
    int os = 0;
    for(int i =1;i<arr.length;i++)
    {
        int nb =Math.min(ob,arr[i]-os);
        int ns = Math.max(os,arr[i]-ob-tex);
        ob = nb;
        os = ns;
    }
    return os;
}
}
