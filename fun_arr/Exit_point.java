import java.util.*;
public class Exit_point{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int [][] arr = new int[n][m];
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<m;j++)
			{
				arr[i][j] =scn.nextInt();
				
				}
			}
			ExitPoint(arr);
			
		}
		public static void ExitPoint(int [] [] arr)
		{
			int n = arr.length;
			int m = arr[0].length;
			int i=0;
			int j =0;
			int  dir =0;
			while(true)
			{
				dir = dir+arr[i][j];
				dir = dir%4;
				if(dir ==0)//move towards east
				{
					j++;
					if(j>=m)
					{
						j--;
						break;
						}
					}
					if(dir == 1)//move towards south
					{
						i++;
						if(i>=n)
						{
							i--;
							break;
							
							}
						}
						if(dir == 2)//move towards west
						{
							j--;
							if(i<0)
							{j++;
								break;
								}
							}
							if(dir ==3)
							{
								i--;
								if(i<0)
								{
									i++;
									break;
									}
								
								}
				}
				System.out.println(i+"\n"+j);
			} 
	}
