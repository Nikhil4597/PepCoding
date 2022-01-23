import java.util.*;
public class pattern1
{
	public static void main(String[] args)
	{
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		pp1(n,"");//print pattern 1
		}
		public static void pp1(int n,String ans)
		{
			
			if(n==0)
			{
				//System.out.print(ans+"\t");
				return;
				}
				System.out.println(ans+"*\t");
				pp1(n-1,ans+"*\t");
		 }
		
}
