import java.util.*;
public class MaxDisToClosests{
    public static int maxDisToClosest(int  [] seats)
    {
        int l = -1;
        int maxDis = 0;
        for(int i =0;i<seats.length;i++)
        {
            if(seats[i] == 1)
            {
                if(l == -1)
                {
                    maxDis = i;
                    l = i;
                }
                
                else {
                    int dis = (i-l)/2;
                    maxDis = Math.max(maxDis,dis);
                    l = i;
                }
            }
            else if(i == seats.length-1 && seats[i]!= 1)
            {
                int dis  = seats.length -l-1;
                maxDis = Math.max(maxDis,dis);

            }
        }
        return maxDis;
    }
    public static void main(String [] args)
    {
        int [] arr = {1,0,0,0,1,0,1};
        System.out.println(maxDisToClosest(arr));
    }
}