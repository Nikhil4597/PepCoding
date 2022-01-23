import java.util.*;
public class CelebrityProb{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int [n][n];
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        findCelebrity(arr);
    }
    public static void findCelebrity(int [][] arr)
    {
           Stack<Integer> stk = new Stack <> ();
           for(int i =0;i<arr.length;i++)
           {
			   stk.push(i);
			   
			   }
			   while(stk.size()!=1)
			   {
				   int k = stk.pop();
				   int  j = stk.pop();
				   if(arr[k][j]==0)
				   {
					   stk.push(k);
					   }
					   else
					   {
						   stk.push(j);
							 }
				   }
				   int idx  = stk.pop();
				   boolean flg = true;
				   for(int i =0;i<arr.length;i++)
				   {
					   if(i!=idx && arr[idx][i]!=0)
					   {
						   flg = false;
						  System.out.println("none");
						  return ;
						  
						   }
					   }
					for(int i =0;i<arr.length;i++)
				   {
					   if(i!=idx && arr[i][idx]!=1)
					   {
						   flg = false;
						  System.out.println("none");
						  return ;
						   }
					   }
					   System.out.println(idx);
					   
					   
	
    }
}
// 4
// 0 0 0 0
// 1 0 1 1
// 1 1 0 1
// 1 1 1 0
