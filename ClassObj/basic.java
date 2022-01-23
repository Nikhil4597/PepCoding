import java.util.*;
public class basic{
	public static void main(String  [] args)
	{
		int [] a = new int [1] ;
		a[0] = 10;
		helper(a);
		System.out.println(a[0]);
	}
	public static void helper(int [] a)
	{
		a = new int [1];

		a[0] =20;
	}
}
