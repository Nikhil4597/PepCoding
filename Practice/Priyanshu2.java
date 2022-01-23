import java.util.*;
public class Priyanshu2{
  public static void main(String[] args) {
    Scanner scn=  new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int [n];
    for(int i =0;i<n;i++)
    {
      arr[i] = scn.nextInt();
    }
    System.out.println(findAns(arr));
  }
  public static int findAns(int [] arr)
  {
    int count =0;
    int i =0;
    while(!onOff(arr) && i<arr.length)
    {
      if(arr[i]==0)
      {
        arr[i]=1;
      }
      for(int j = i+1;j<arr.length;j++)
      {
        if(arr[j]==0)
      {
        arr[j]=1;
      }
      else
      {
        arr[j]=0;
      }
      }
      i++;
      count++;
    }
    return count;
  }
  public static boolean onOff(int [] arr)
  {
    for(int i =0;i<arr.length;i++)
    {
      if(arr[i]==0)
      {
        return false;
      }
    }
    return true;
  }
  }
