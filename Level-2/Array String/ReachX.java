import java.util.*;
public class ReachX{
    public static int reachNumber(int target)
    {
        target = Math.abs(target);
        int step =0;
        int sum =0;
        while(sum<target)
        {
            step++;
            sum+=step;
        }
        while((sum-target)%2 !=0)
        {
            step++;
            sum+=step;
        }
        return step;
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        System.out.println(reachNumber(x));
    }
}