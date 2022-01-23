import java.io.*;
import java.util.*;

public class LeftHighEle {
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    int[] ngl = solve(a);
    display(ngl);
  }

  public static int[] solve(int[] arr) 
  {
    int n = arr.length;
    int [] ans  = new int [n];
    ans[0] = -1;
    Stack <Integer> stk = new Stack <>();
    stk.push(arr[0]);
    for(int i =1;i<n;i++)
    {
      while(stk.size()>0 && stk.peek()<arr[i])
      {
        stk.pop();
      }
      if(stk.size()==0)
      {
        ans[i] =-1;
      }
      else{
        ans[i] = stk.peek();
      }
      stk.push(arr[i]);
    }
    return ans;
  }

}