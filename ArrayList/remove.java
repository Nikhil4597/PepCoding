import java.util.*;
public class remove{
	public static void main(String[] args)
	{
		
		Scanner scn =new Scanner(System.in);
		String str1 = scn.next();
		StringBuilder str  =str1;
		str.delete(3,4);
		System.out.println(str);
		
		}
	}
