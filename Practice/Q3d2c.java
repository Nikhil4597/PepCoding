import java.util.*;
public class Q3d2c{
  public static void main(String [] args)
  {
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int [] arr = new int [n];
  for(int  i =0;i<n;i++)
  {
    arr[i] = scn.nextInt();
  }
  System.out.println(findAns(arr));
  }
  public static String findAns(int[] arr)
  {
    int ans = arr[0];
    for(int i =1;i<arr.length;i++)
    {
      ans^=arr[i];
    }
    if(ans==0)
    {
      return "YES";

    }
    else{
      return "NO";
    }
  }
}
