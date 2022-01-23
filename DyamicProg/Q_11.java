import java.util.
public class Q_11{
public static void main(String [] args)
 {
    Scanner scn = new int Scanner(System.in);
    int n = scn.nextInt();
    int [] val = new int [n];
    for(int i =0;i<n;i++)
    {
        val[i] = scn.nextInt();
        
    }
    int [] wt = new int [n];
    for(int i =0;i<n;i++)
    {
        wt[i] = scn.nextInt();
        
    }
    int cap = scn.nextInt();
    int ans =    knapsackZeroOne(var,wt,cap);
    System.out.println(ans);
 }
    public static int knapsackZeroOne(int [] var,int [] wt,int cap)
    {
        
    }
}
