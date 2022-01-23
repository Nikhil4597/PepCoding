import java.util.*;
public class MaxRangeQuries{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        for(int z=0;z<t;z++)
        {
            int n  = scn.nextInt();
            int k= scn.nextInt();
            int [] [] queries = new int [n][2];
            int len = 100000;
        
            for(int i=0;i<n;i++)
            {
                queries[i][0] = scn.nextInt();
                queries[i][1] = scn.nextInt();

            }
            int [] arr = getPrefix(len,queries);
            int [] countk = new int [len];
            countk[0] = arr[0]==k?1:0;
            for(int i=1;i<len;i++)
            {
                if(arr[i]==k)
                {
                    countk[i] = countk[i-1]+1;
                }
                else{
                    countk[i] = countk[i-1];
                }
            }
            int [] countkpp = new int [len];
            countkpp[0] = arr[0]==k+1?1:0;

            for(int i =1;i<len;i++)
            {
                if( arr[i]== k+1)
                {
                    countkpp[i] = countkpp[i-1]+1;
                }
                else{
                    countkpp[i] = countkpp[i-1];
                }
            }
            int max_count =0;
            for(int i =1;i<queries.length;i++)
            {
                int si = queries[i][0];
                int ei = queries[i][1];
                int sim1 = si==0?0:(si-1);
                int val = countk[len-1]-(countk[ei]-countk[sim1])+(countkpp[ei]-countkpp[sim1]);
                if(max_count<val)
                {
                    max_count = val;
                }
            }
            System.out.println(max_count);
        }
    }
     public static int [] getPrefix(int len ,int [] [] q )
    {
        int [] arr = new int [len];
        for(int i =0;i<q.length;i++)
        {
            int si = q[i][0];
            int en = q[i][1];
            arr[si]+=1;
            if(en+1<arr.length)
            {
                arr[en+1]+= -1;
            }
        }
        int  [] farr = new int [len];
        farr[0] = arr[0];
        for(int i=1;i<len;i++)
        {
            farr[i] = arr[i]+farr[i-1];
        }
        return farr;

    }
}