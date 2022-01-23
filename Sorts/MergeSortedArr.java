import java.io.*;
import java.util.*;

public class MergeSortedArr {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    int m = a.length;
    int n = b.length;
    int [] merge = new int [m+n];
    int i =0;
    int j =0;
    int k =0;
    while( i<m && j<n)
    {
    	if(a[i]<b[j])
    	{
    		merge[k] = a[i];
    		i++;
    		k++;
    	}
    	else{
    		merge[k] = b[j];
    		j++;
    		k++;
    	}

    }
    if(i<m)
    {
    	merge[k] = a[i];
    	i++;k++;
    }
    if(j<n)
    {
    	merge[k] = b[j];
    	j++;k++;
    }
    
    return merge;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}