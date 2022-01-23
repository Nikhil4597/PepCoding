import java.util.*;
public class SqrofSortedArr{
    public static  int[] sortedSquares(int [] nums)
    {
        int  [] sqrs = new int [nums.length];

            int i =0 ;int j = sqrs.length;
            for(int  k =sqrs.length-1;k>=0;k--)
            {
                int vali = nums[i]*nums[i];
                int valj = nums[j]*nums[j];
                if(vali<valj)
                {
                    j--;
                    sqrs[k] = valj;
                }
                else{
                    i++;
                    sqrs[k] = vali;
                }

            }
            return sqrs;
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<n;i++)
        {
            arr[i] = scn.nextInt();

        }
        int [] ans = sortedSquares(arr);
        for(int i:ans)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}