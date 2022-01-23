import java.util.*;
public class PrintAllPalindrome{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
		}
		public static void solution(String str)
		{
			int n = str.length();
			for(int i =0;i<n;i++)
			{
				for(int j =i;j<n;j++)
				{
					String temp = str.substring(i,j+1);
					
					if(isPalindrome(temp))
					{
						System.out.println(temp);
						}
					}
				}
			}
			public static boolean isPalindrome(String str)
			{
				int l =0;
				int r = str.length()-1;
				while(l<r)
				{
					if(str.charAt(l)!=str.charAt(r))
					{
						return false;
						}
					l++;
					r--;
					}
					return true;
				}
	}
 //in string the range substring takes is [i,j)
 //for str.substring(i,j)
