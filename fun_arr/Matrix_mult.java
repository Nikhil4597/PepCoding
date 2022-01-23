import java.util.*;
public class Matrix_mult{
	public static void main(String[] args)
	{
		Scanner scn  = new Scanner(System.in);
		int n1 = scn.nextInt();
		int m1 = scn.nextInt();
		int [][] A = new int [n1][m1];
		for(int i=0;i<n1;i++)
		{
			for(int j =0;j<m1;j++)
			{
				A[i][j]=scn.nextInt();
				 
				}
			}
			int n2 = scn.nextInt();
			int m2 = scn.nextInt();
			int [][] B = new int [n2][m2];
			for(int i=0;i<n2;i++)
			for(int j= 0;j<m2;j++)
			{
				B[i][j]= scn.nextInt();
			}
			matrix_multi(A,B);
			
		}
		public static void matrix_multi(int[][] A,int [][]B)
		{
			int n1 = A.length;
			int m1 = A[0].length;
			int n2 = B.length;
			int m2 = B[0].length;
			
			if(m1!=n2)
			{
				System.out.println("Invalid input");
				return;
				}
			int [] [] ans = new int [n1][m2];
			for(int  i =0;i<n1;i++)
			{
				for(int j=0;j<m2;j++)
				{
					int val =0;
					for(int k =0;k<m1;k++)
					{
						val = val+A[i][k]*B[k][j];
						
						}
						ans[i][j]  = val;
					}
				}
				print(ans);
			} 
		
		public  static void print(int [] [] ans)
		{
			int row = ans.length;
			int col = ans[0].length;
			for(int  i=0;i<row;i++)
			{for(int j =0;j<col;j++)
				{
					System.out.print(ans[i][j]+" ");
					}
					System.out.println();
				}
			}
	}
	

