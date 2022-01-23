import java.util.*;
public class TargetSumSubset{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int [n];
    for(int i =0;i<n;i++)
    {
      arr[i] = scn.nextInt();
    }
    int tar = scn.nextInt();
    // System.out.println(isTargetSum(arr,n-1,tar));
    System.out.println(isTargetSum(arr,0,tar,0));
  }
  public static boolean isTargetSum(int [] arr,int idx,int tar,int sum)
  {
    if(tar==0)
    {
      return true;
    }
    if(tar<0||idx ==arr.length)
    {
      return false;
    }


    boolean ans1 =  isTargetSum(arr,idx+1,tar-arr[idx],sum+arr[idx]);
        boolean ans2 =isTargetSum(arr,idx+1,tar,sum);
        return ans1 || ans2;
  }

}
