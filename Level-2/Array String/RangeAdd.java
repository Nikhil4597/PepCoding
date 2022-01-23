//prefix sum based
import java.util.*;
public class RangeAdd{
    public  static int [] getModifiedArray(int length,int [][] updates){
        int [] ans = new int [length];
        for(int i =0;i<updates.length;i++)
        {
            int si = updates[i][0];
            int ei = updates[i][1];
            int inc = updates[i][2];
            ans[si]+=inc;
            if(ei+1<length)
            {
                ans[ei+1]+= -inc;
            }

        }
        for(int i:ans)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        int [] sol = new int [length];
        for(int i =0;i<sol.length;i++)
        {
            if(i == 0)
            {
                sol[i] = ans[i];
            }
            else{
                sol[i] = ans[i]+sol[i-1];
            }
        }
        return sol;
    }
    public static void main(String [] args)
    {
        int [][] arr = {{1,3,2},{2,4,3},{0,2,-2}};

        int [] ans = getModifiedArray(5,arr);
        for(int i:ans)
        {
            System.out.println(i);
        } 
    }
}