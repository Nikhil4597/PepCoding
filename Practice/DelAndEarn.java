import java.util.*;
public class DelAndEarn{
  public static void main(String [] args )
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int [n];
    for(int i =0;i<n;i++)
    {
      arr[i] = scn.nextInt();
    }
    delAndEarn(arr,"",0);
  }
  public static void delAndEarn(int [] arr,String asf,int idx)
  {
    if(idx==arr.length-1)
    {
      System.out.println(asf);
      return;
    }
    for(int i =0;i<arr.length;i++)
    {
      int select = arr[i];
      for(int j =i+1;j<arr.length;j++)
      {
        if(arr[j]!=select+1 && arr[j]!=select-1)
        {
          delAndEarn(arr,asf+select+" ",i);
        }
      }
    }
  }
}
