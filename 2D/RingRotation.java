import java.util.*;
public class RingRotation{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); //no. of row
		int m = scn.nextInt();//no. of column
		int [] [] arr = new int [n][m];
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<m;j++)
			{
				arr[i][j] =scn.nextInt();
				
				}
			}
			int s =  scn.nextInt();//shell No.
			int r = scn.nextInt();//no of Rotation 
			shellRotation(arr,s,r); 
			for(int i =0;i<n;i++)
			{
				for(int j =0;j<m;j++)
				{
					System.out.print(arr[i][j]+"\t");
					}
					System.out.println();
									}
		}
		public static void shellRotation(int [][] arr,int s,int r)
		{
			int []sudo =getElement(arr,s);
			rotateAnArray(sudo,r);
			fillElement(arr,sudo,s);
			}
		public static void rotateAnArray(int []arr,int d)
		{
			int n = arr.length;
			d =d%n;
			if(d<0)
			{
				d =n+d;
				}
				reverse(arr,0,n-1);
			reverse(arr,0,d-1);
			reverse(arr,d,n-1);
			}
			public static void reverse(int []arr,int l,int r){
			while(l<r)
			{
				int temp = arr[l];
				arr[l] =arr[r];
				arr[r] = temp;
				l++;
				r--;
				}	
				}
				public static int[] getElement(int [][] arr,int s)
				{
					int n = arr.length;
					int m =arr[0].length;
					int sr = s-1;//starting row
					int sc = s-1;
					int er =n-s;
					int ec =m-s;
					int size = 2*(er-sr)+2*(ec-sc);
					int idx =0;
					int [] get = new int [size];
					for(int  i =sr;i<=er;i++)
					{
						get[idx] = arr[i][sc];
						idx++;
						}
						sc++;
					for(int j= sc;j<=ec;j++)
					{
						get[idx] = arr[er][j];
						idx++;
						}	
						er--;	
						for(int i = er;i>=sr;i--)
						{
							get[idx] = arr[i][ec];
							idx++;
							}
							ec--;
							for(int j =ec;j>=sc;j--)
							{
								get[idx] = arr[sr][j];
								idx++;
								}
								sr++;
						return get;
					}
					public static void fillElement(int [][] arr,int []get,int s)
					{
						
					int n = arr.length;
					int m =arr[0].length;
					int sr = s-1;//starting row
					int sc = s-1;
					int er =n-s;
					int ec =m-s;
					int idx =0;
					for(int  i =sr;i<=er;i++)
					{
						arr[i][sc]=get[idx] ;
						idx++;
						}
						sc++;
					for(int j= sc;j<=ec;j++)
					{
					arr[er][j]=	get[idx] ;
						idx++;
						}	
						er--;
						for(int i = er;i>=sr;i--)
						{
							 arr[i][ec]=get[idx];
							idx++;
							}
							ec--;
							for(int j =ec;j>=sc;j--)
							{
								 arr[sr][j]=get[idx];
								idx++;
								}
								sr++;
						}
	}
