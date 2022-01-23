import java.util.*;
public class add_arr{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		int [] arr1 = new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr1[i] = scn.nextInt();
			} 
			int n2 =scn.nextInt();
			int [] arr2 = new int [n2];
			for(int i=0;i<n2;i++)
			{
				arr2[i] = scn.nextInt();
				
				}
				
				
				int n3 = Math.max(n1,n2)+1;
				int [] ans = new int[n3];
				
				int i =n1-1;
				int j = n2-1;
				int k =n3-1;
				int carry =0;
				
				while(k>=0)
				{
					int val= 0;
					if(i>=0)
					{
						val = val+arr1[i];
						
						}
					if(j>=0)
					{
						val = val+arr2[j];
						}
						
						val = val+carry;
						int rem = val%10;
						int quo = val/10;
						ans[k] = rem;
						carry = quo; 
					i--;
					j--;
					k--;
					}
					if(ans[0]>0)
					{
						System.out.println(ans[0]);
						
						
						}
						for(int l =1;l<n3;l++)
						{
							System.out.println(ans[l]);
							}
		}
		
	}
