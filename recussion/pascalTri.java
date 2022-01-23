import java.util.*;
public class pascalTri{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		pascal(n,"");
	}
		
		public static void pascal(int n,int [] ans)
		{	
			if(n==-1)
			{
			System.out.println(ans);  
			return ;}
			pascal(n-1,ans+"\t");
			int val = 1;
			for(int i =0;i<n;i++)
			{
			ans+=val;
			val*=(n-i+1)/(i+1);
			}
			 System.out.println();
			
			}
	}
