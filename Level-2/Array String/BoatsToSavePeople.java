import java.util.*;
public class BoatsToSavePeople{
    public static int numRescueBoats(int [] people,int limit)
    {
        int nob =0;
        Arrays.sort(people);
        int sum =0;
        for(int  i =0;i<people.length;i++)
        {
            sum+=people[i];
            if(sum>=limit)
            {
                sum =0;
                nob++;

            }
        }
        return nob;
    }
    public static void main(String [] args)
    {
        // Scanner scn = new Scanner(System.in);
        int  []arr = {3,5,3,4};
        int limit =5;
        System.out.println(numRescueBoats(arr,limit));
    }
}