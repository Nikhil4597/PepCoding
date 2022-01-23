import java.util.*;
public class StockSpan{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        } 
        int [] ans = solve(arr);
        for(int i =0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        } 
    }
    public static int [] solve(int []arr)
    {
        int n = arr.length;
        int [] ans = new int [n];
        ans[0] =1;

        Stack <Integer> stk = new Stack <>();
        stk.push(0);
        for(int i =1;i<n;i++)
        {
            while(stk.size()>0 && arr[stk.peek()]<arr[i])
            {
                stk.pop();
            }
            if(stk.size()==0)
            {
                ans[i]=i+1;
            }
            else{
                ans[i] = i-stk.peek();

            }
            stk.push(i);
        }
        return ans;
    }
}