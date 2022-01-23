import java.util.*;
public class GenBrackets{
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		int n =scn.nextInt();
		ArrayList<String> ans =AllParenthesis(n);
		System.out.println(ans);
		}
		public static ArrayList<String> AllParenthesis(int n)
		{
			if(n==1)
			{ArrayList<String> ans = new ArrayList<>();
				ans.add("()");
				return ans;
				}
		
			if(n==0)
			{ArrayList<String> ans = new ArrayList<>();
				return ans;
				}
				ArrayList<String> sol = new ArrayList<>();
		{ArrayList<String> left =	AllParenthesis(n-1);
		for(int i =0;i<left.size();i++)
		{
			String s=left.get(i);
			sol.add("("+s);
			sol.add(")"+s);
			}}
		
			return sol;
			}
	}
