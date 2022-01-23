import java.util.*;
public class Show_spiral{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int  [] [] arr =new int [n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j] = scn.nextInt();
				
				}
			}
			ShowSpiral(arr);
	}
	public static void ShowSpiral(int [][] arr){
		int row = arr.length;
		int col = arr[0].length;
		int esf = 0;
		int tne = row*col;
		int rs =0;
		int cs =0;
		int re =row-1;
		int ce =col-1;
		while(esf<tne)
		{
			for(int i=rs ;i<=re && tne>esf;i++)
			{
				System.out.println(arr[i][cs]);
				esf++;
				}
				cs++;
				for(int j=cs;j<=ce&&tne>esf;j++)
				{
					System.out.println(arr[re][j]);
					esf++;
					
					}
					re--;
					for(int i =re;i>=rs && tne>esf;i--)
					{
						System.out.println(arr[i][ce]);
						esf++;
						}
						ce--;
						for(int j =ce;j>=cs &&tne>esf;j--)
						{
							System.out.println(arr[rs][j]);
							esf++;
						}
						rs++;
			}
		}
	}
