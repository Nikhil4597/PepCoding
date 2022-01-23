import java.util.*;
public class Wipro_p{
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char [] str1 = new char [str.length()];
		for(int i =0;i<str.length();i++)
		{
			str1[i] = str.charAt(i);
		}
		Arrays.sort(str1);
		int count=0;
		for(int i=0;i<str1.length-1;i++)
		{
			if(str1[i]!=str1[i+1])
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
