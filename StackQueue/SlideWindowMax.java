import java.io.*;
import java.util.*;

public class SlideWindowMax{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    int [] ans  = maxSlidingWindow(a,k);
    for(int i =0;i<ans.length;i++)
    {
		System.out.println(ans[i]);
		
		}
 }
 public static int [] maxSlidingWindow(int [] nums,int k)
 {
	 int n =  nums.length;
	 
	   int [] ngv  = new int [n];//next greater value
	   Stack <Integer> st = new Stack<>();
	   ngv[n-1]= n+1;
	   st.push(n-1);
	   for(int i =n-2;i>=0;i--)
	   {
		   while(st.size()>0 && nums[st.peek()]<=nums[i])
		   {
			   st.pop();
			  
			   }
			  if(st.size()==0)
			  {
				  ngv[i] = n+1;
				  }
			else
			{
				ngv[i] = st.peek();
				 
				}
				  
			  st.push(i);
			  
		   } 
		   int ans [] = new int [n-k+1];
		   //int idx =0;
		   int j =0;
		   
		   for(int i =0;i<=n-k;i++)
		   {
			   if(i>j){
				j =i;
			}
			   while(ngv[j]<i+k)
			   {
				  j = ngv[j];
				   
				   }
				//   System.out.print(num[j]+" ");
				ans[i] = nums[j];
			   }
	 return ans;
	
}
}
