import java.util.*;
public class diff_arr{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int [] arr1 = new int [n1];
	 for(int i=0;i<n1;i++)
	 {
		 arr1[i] = scn.nextInt();
		 
		 }
		 int n2= scn.nextInt();
		 int []arr2 = new int[n2];
		 for(int i=0;i<n2;i++)
		 {
			 arr2[i] = scn.nextInt();
			 
			 }
			 int len = n2;
			 int [] sub = new int [n2];
			 int i = n1-1;
			 int j = n2-1;
			 int k = len-1;
			 int carry =0;
			 
			 while(k>=0)
			 {
				 int diff;
				 if(i>=0)
				 {
					 diff = arr1[i];
					 
					 }
					 else
					 {
						 diff =0;
						 }
						 if(arr2[j]+carry>=diff)
						 {
							sub[k] = arr2[j]+carry-diff;
							carry =0; 
							 }
							 else
							 {
								 sub[k] = arr2[j]+10+carry-diff;
								 carry = -1;
								 }
						i--;
							j--;
							k--;	 
								 
				 } 
		int idx =0;
		while(sub[idx]==0)
		{
			idx++;
			
			}
			for(int l = idx;l<len;l++)
			{
				System.out.println(sub[l]);
				}
		}
	}
