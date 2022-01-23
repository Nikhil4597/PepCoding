import java.util.*;
public class StairPathWithVeriableJump{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr =new int [n];
		for(int i =0;i<n;i++)
		{
			arr[i] =scn.nextInt();
			}
		int [] ways = new int [n+1];
		ways[n] =1;
		for(int i =n-1;i>=0;i--)
		{
			for(int j=1;j<=arr[i]&&(i+j)<ways.length;j++)
			{
				ways[i]+=ways[i+j];
				
				}
			}
			//for(int i =0;i<n+1;i++)
			//System.out.println(ways[i]);
System.out.println(ways[0]);
		}
				
	}
