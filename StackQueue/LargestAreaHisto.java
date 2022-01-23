import java.util.*;
public class LargestAreaHisto {

    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println(findMaxArea(arr));
    }
    public static int  findMaxArea(int [] arr)
    {
        int [] l_min = findLeftMin(arr);

        int [] r_min = findRightMin( arr);
        int max = 0;
        for( int i =0;i<arr.length;i++)
        {
            int len = arr[i];
            int wid = r_min[i] - l_min[i]-1;
            int area = len*wid;
            if(max<area)
            {
                max = area;
            } 

        }   
        return max;  
    }
    public static int[] findLeftMin(int [] arr)
    {
        int n  = arr.length;
        int [] ans = new int [n];
        ans[0] =-1;
        Stack <Integer> stk = new Stack <> (); 
        stk.push(0);
        for(int i =1;i<n;i++)
        {
            while(stk.size()>0 && arr[stk.peek()]>=arr[i])
            {
                stk.pop();
            }
            if(stk.size()==0)
            {
                ans[i]=-1 ;

            }
            else{
                ans[i] = stk.peek();
            }
            stk.push(i);
        }
        return ans;
    }
    public static int[] findRightMin(int [] arr)
    {

        int n  = arr.length;
        int [] ans = new int [n];
        ans[n-1] =n;
        Stack <Integer> stk = new Stack <> (); 
        stk.push(n-1);
        for(int i  = n-2;i>=0;i--)
        {
            while(stk.size()>0 && arr[stk.peek()]>=arr[i])
            {
                stk.pop();
            }
            if(stk.size()==0)
            {
                ans[i]=n ;

            }
            else{
                ans[i] = stk.peek();
            }
            stk.push(i);
        }
        return ans;
    }
}
