import java.util.*;
public class Q_1{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		String str =scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
		
		}
	public static String compression1(String str)
	{
		StringBuilder  comp1= new StringBuilder();
		
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)!=str.charAt(i+1))
			{
				comp1.append(str.charAt(i));
				
				}
				
			}
				comp1.append(str.charAt(str.length()-1));
			return comp1.toString();
		}
		
	public static String compression2(String str){
		StringBuilder comp2=new StringBuilder();
		comp2.append(str.charAt(0));
		int count =0;
		for(int i =0;i<str.length()-1;i++)
		{
			count++;
			if(str.charAt(i)!=str.charAt(i+1))
			{
				if(count>1){
				comp2.append(count);
			}
				count=0;
				comp2.append(str.charAt(i+1));
				}
				
			}
			count++;	
			comp2.append(count);
			return comp2.toString();
			
}
	}
