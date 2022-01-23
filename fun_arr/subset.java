import java.util.*;
public class subset{
	public static void main(String[] args)
	{ Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int []arr = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] = scn.nextInt();
			}
		findSubset(arr);
		}
		public static void findSubset(int [] arr)
		{
			int n =arr.length;
			for(int i =0;i<Math.pow(2,n);i++)
			{
				int [] result = binaryNum(i,n);
				

				for(int j =0;j<n;j++)
				{
					if(result[j]==1)
					{System.out.print(arr[j]+"\t");
						
						}
						else {
							System.out.print("-\t");
							}
					}
					System.out.println();
				}
			}
			public static int [] binaryNum(int num,int n)
			{
				int [] arr = new int [n];
				int idx =n-1;
				while(num>0)
				{
					int quo = num/2;
					int rem =num%2;
					arr[idx] =rem;
					idx--;
					num =quo;
					}
					return arr;
					
				}
	}
