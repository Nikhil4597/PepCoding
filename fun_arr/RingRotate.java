import java.util.*;
public class RingRotate{
	public static void main(String [] args)
	{Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int m = scn.nextInt();
		int [] [] arr = new int[n][m];
		for(int i=0;i<n;i++)
		{for(int j =0;j<m;j++)
		{arr[i][j] = scn.nextInt();
	}}
	int s = scn.nextInt();
	int r =scn.nextInt();
	
		matrix_rotation(arr,s,r);
	
		}
		public static void matrix_rotation(int [][] arr,int s,int r)
		{
			int [] oneD =convert_one_D(arr,s);
			rotate(oneD,r);
			convert_two_D(arr,oneD,s);
			display(arr);
			
			}
			public  static void display(int [][] arr)
			{
				int n = arr.length;
				int m = arr[0].length;
				
				for(int i =0;i<n;i++)
				{
					for(int j=0;j<m;j++)
					{
						System.out.print(arr[i][j]+" ");
						
						}
						System.out.println();
					}
				}
			public static int[] convert_one_D(int [][]arr,int s)
			{
				int n = arr.length;
				int m = arr[0].length;
				int rs =s-1;
				int cs = s-1;
				int re = n-s;
				int ce = m-s;
				int nof = 2*(re-rs+1)+2*(ce-cs+1)-4;
				int [] oneD = new int[nof];
				int idx =0;
				for(int i =rs;i<=re;i++)
				{
					oneD[idx] = arr[i][cs];
					idx++;
					}
					cs++;
					for(int j =cs;j<=ce;j++)
					{
						oneD[idx] = arr[re][j];
						idx++;
						}
						re--;
						for(int  i =re;i>=rs;i--)
						{
							oneD[idx] =arr[i][ce];
							idx++;
							}
							ce--;
							
							for(int j =ce;j>=cs;j--)
							{
								oneD[idx] = arr[rs][j];
								idx++;
								}
								rs++;
				return oneD;
				}
			public static void rotate(int [] arr,int r)
			{
				int n = arr.length-1;
				
				r = r%n;
				if(r<0)
				{
					r = n+r;
					}
						reverse(arr,0,n);
						reverse(arr,0,r-1);
						reverse(arr,r,n);
				}
			public static void convert_two_D(int [][]twoD,int [] oneD,int s )
			{
				int n =twoD.length;
				int m = twoD[0].length;
				 
				int rs = s-1;
				int cs = s-1;
				int re = n-s;
				int ce = m-s;
				int idx =0;
				for(int i =rs;i<=re;i++)
				{
					twoD[i][cs] = oneD[idx];
					idx++;
					}
					cs++;
					for(int j =cs;j<=ce;j++)
					{
						twoD[re][j] = oneD[idx];
						idx++;
						}
						re--;
						
						for(int i = re;i>=rs;i--)
						{
							twoD[i][ce] = oneD[idx];
							idx++;
							} 
							ce--;
							
							for(int j =ce;j>=cs;j--)
							{
								twoD[rs][j] = oneD[idx];
								idx++; 
								}
								rs++;
				
				
				}
			public static void reverse(int [] arr,int ip,int ep)
			{
				while(ip<ep)
				{
					int temp = arr[ip];
					arr[ip] = arr[ep];
					arr[ep] = temp;
					ip++;
					ep--;}
					
				}
			
	} 
