import java.util.*;
public class Q2d2c{
  public static void main(String [] args)
  {
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int m = scn.nextInt();
  int [] arr = new int [n+m];
  for(int i=0;i<n+m;i++){
    arr[i] = scn.nextInt();
  }
  System.out.println(findAns(arr,n,m));
  }
  public static int findAns(int [] arr,int m,int n )
  {

      int [] temp = new int [arr.length];
      for(int i =0;i<arr.length;i++)
      {
        temp[i] = arr[i];
      }
      Arrays.sort(temp);
      int count =0;

      for(int i =0;i<n && !check(arr,temp);i++)
      {
        for(int j =n;j<m+n && !check(arr,temp);j++)
        {
          if(arr[i]>arr[j])
          {
            int val = arr[i];
            arr[i] = arr[j];
            arr[j] = val;
            count++;
          }
        }
      }
      return count;
  }
  public static boolean check(int [] arr,int [] temp)
  {
      for(int i =0;i<arr.length;i++)
      {
        if(arr[i]!=temp[i])
        {
          return false;
        }
      }
      return true;
  }
}
