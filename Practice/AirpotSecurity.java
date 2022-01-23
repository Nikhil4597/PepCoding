import java.util.*;
public class AirpotSecurity{
  public static void main(String [] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int [n];
    for(int i =0;i<n;i++)
    {
      arr[i] = scn.nextInt();
    }
    int  [] ans = sort(arr);
    for(int i =0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
  public static int [] sort(int [] arr)
  {
  
  }
  public static void swap(int [] arr,int a,int b)
  {
    int k = arr[b];
    arr[b] = arr[a];
    arr[a] = k;
  }
}
