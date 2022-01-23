import java.util.*;
public class RightHighEle{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
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
    public static int [] solve(int [] arr)
    {   
        int n = arr.length;
        int [] ans = new int [n];
        ans[n-1] =  -1;
        Stack <Integer> stk = new Stack<>();
         stk.push(arr[n-1]);
        for(int i =n-2;i>=0;i--)
        {
            while(stk.size()>0 && stk.peek()<arr[i])
            {
                stk.pop();
            }
            if(stk.size()==0)
            {
                ans[i]=-1;
            }
            else
            {
                ans[i] =stk.peek();
            }
             
            stk.push(arr[i]);
        }   
        return ans;
    }
}