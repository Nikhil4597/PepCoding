import java.util.*;
public class Q_3{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.print(compression1(str));
		//System.out.print(compression2(str));
		}
		public static String compression1(String str){
		
		int n  =str.length();
		for(int i =n-1;i>=0;i--)
		{
			if(str.charAt(i)==str.charAt(i-1))
			str.remove(i);
			}
			return str;
			}
	//	public static String compression2(String str){}
	}
























