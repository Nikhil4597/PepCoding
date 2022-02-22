import java.util.*;
public class ReverseNum{
	public static int reverse(int num){
		char [] ch = Integer.toString(num).toCharArray();
		int  i = ch[0] =='-'?1:0;
		int j = ch.length-1;
		while(i<j)
		{
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		int ans = Integer.parseInt(new String(ch));
		return ans;

	}
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(reverse(n));
	}
}
