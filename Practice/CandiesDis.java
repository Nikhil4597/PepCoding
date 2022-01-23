import java.util.*;
public class CandiesDis{
	public  static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int [] arr = new int  [n];
		for(int i =0;i<n;i++)
		{
			arr[i] = scn.nextInt();
		}
		findArrange(k,n,arr,"",0);

	}


	public static void findArrange(int k,int n,int [] arr,String ssf,int size)
	{
		if(  size == n)
		{
			System.out.println(ssf);
			return;
		}
		if(size>n)
		{
			return;
		}
		 for(int i =1;i<=k;i++)
		 {
		 	System.out.print("[");
		 	for(int j =0;j<arr.length;j++){
		 	findArrange(k,n,arr,ssf+arr[j]+" ,",size+1);
		 }
		 System.out.print("]");
		}

	}
}