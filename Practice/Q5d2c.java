import java.util.*;
public class Q5d2c{
  public static void main(String [] args)
  {
    Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int m = scn.nextInt();
  int k = scn.nextInt();
  int [] arr1 = new int [n];
  for(int i =0;i<n;i++)
  {
    arr1[i]= scn.nextInt();
  }
  int [] arr2 = new int [m];
  for(int i =0;i<m;i++)
  {
    arr2[i] = scn.nextInt();
  }
  Arrays.sort(arr1);
  Arrays.sort(arr2);
  System.out.println(findAns(arr1,arr2,k));
}
public static int findAns(int [] arr1,int [] arr2,int k){

  int ans = arr1[arr1.length-1]+arr2[arr2.length-1];
  int i = arr1[arr.length];
  int j = arr
  int [] maxArr = new int [k-2]
}

}
