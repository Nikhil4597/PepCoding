import java.util.;
public class Main{
	public static void main(String [] args)
	{
		Scanner scn = new scn Scanner(System.in);
		int n = scn.nextInt();
		//int m = scn.nextInt();
		int [] arr2d = new int [n][n];
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				arr2d[i][j] = scn.nextInt();
				
				}
			} 
			int x = scn.nextInt();
			System.out.println(findAns(arr2d,x))
		}
	}
