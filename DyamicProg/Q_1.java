import java.io.*;
import java.util.*;

public class Q_1{

public static void main(String[] args) throws Exception {
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
//  int []arr =new int [n+1];
  int ans =TbuFib(n);
  System.out.println(ans);
  
 }
 //recursion approach
 public static int rec_fib(int n)
 {
 if(n==0||n==1)
 {
 return n;
 }
  int fibb = rec_fib(n-1)+rec_fib(n-2);
  return fibb;
 }
//DP approach
public static int dpFib(int n,int [] arr)
{
  if(n==0||n==1)
  {
	return n;
}
	if(arr[n]!=0)
	{return arr[n];}
	
	int ans =dpFib(n-1,arr)+dpFib(n-2,arr);
	arr[n] =ans;
	return ans;
}
//tarbulant
public static int TbuFib(int n)
{
int [] arr =new int [n+1];
arr[0]=0;
arr[1]=1;
for(int i=2;i<=n;i++)
arr[i] = arr[i-1]+arr[i-2];
return arr[n];
}
}
