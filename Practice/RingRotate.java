import java.util.*;
public class Main{
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int [][] arr = new int [n][m];
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<m;j++)
			{
				arr[i][j] = scn.next();
				}
			}
		}
		int s=  scn.nextInt();
		int r = scn.nextInt();
		ringRoate(arr,s,r);
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<m;j++)
			{
				System.out.println(arr[i][j]+" ");
				}
				System.out.println();
			}
	}
	pubic static void ringRotate(int [] []arr,int s ,int r)
	{
		int [] arr1d = getArr(arr,s);
		reverse(arrld,r);
		fillarr(arr,arr1d);
 	
		}
		public static int [] getArr(int [][] arr,int s)
		{
			}
		public static void reverse(int [] arr,int left,int right)
		{
			while(left<right)
			{
				int temp  = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--; 
				}
			}
		public static void rotate(int [] arr ,int k){
			k = k%arr.length;
			if(k<0)
			{
				k = arr.length+k;
				}
						reverse(arr,0,k-1);
			reverse(arr ,k,n-1);
			reverse(arr,0,n-1);
			}
