import java.util.*;
public class q_4{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] =scn.nextInt();
			
			}
			int max = arr[0];
			for(int i=1;i<n;i++)
			{
				if(max<arr[i])
				{
					max = arr[i];
					}
				}
				
		for(int i =0;i<n;i++)
		{
			for(int j= 0;j<n;j++)
			{
				if(max>arr[j])
				{
					System.out.print("\t");
					
					}
					else if(max== arr[i])
					{
						System.out.print("*\t");
						arr[i]--;
						max--;
						}
				}
				
			}
			}
		}
	
