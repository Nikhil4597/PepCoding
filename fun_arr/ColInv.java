import java.util.*;
public class ColInv{
	public static void main(String [] args){
		int [][] arr = new int[4][4];
		for(int i =0 ;i<4;i++)
		{
			for(int j =0;j<4;j++)
			{
				arr[i][j] = (i+1)*10+(j+1);
				}
			}
			for(int i =0;i<4;i++)
			{for(int j =i;j<4;j++)
			{
				int temp  = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
				}
				} 
				
				for(int i =0;i<4;i++)
				{
					
				int low =0;
				int high =3;
					while(low<high)
					{
						int temp = arr[i][low];
						arr[i][low] = arr[i][high];
						arr[i][high] = temp;
						low++;
						high--;
						
						}
					}
					
				show(arr);
				 
		}
		public static void show(int [][] arr)
		{
			int n = arr.length;
			for(int i =0;i<n;i++)
			{
				for(int j =0 ;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
				}
				System.out.println();
				
			}
	}
}
