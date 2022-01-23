import java.util.*;
public class GetSubseq{
public static void main(String[] args)
{
	Scanner scn = new Scanner(System.in);
	String str =scn.next();
	ArrayList <String> ans = gss(str);
	System.out.println(ans);
	}
	    public static ArrayList<String> gss(String str) {
			if(str.length() ==0)
			{ArrayList<String> return_ans= new ArrayList<>();
				return_ans.add("");
				return return_ans;
				}
			char ch = str.charAt(0);
			String ros =str.substring(1);//rest of string
			ArrayList<String> end_ans =gss(ros);
			ArrayList<String> ans =new ArrayList<> ();
			for(int i =0;i<end_ans.size();i++)
			{
				String S = end_ans.get(i);
					ans.add(S);}
			for(int i =0;i<end_ans.size();i++){
				String S = end_ans.get(i);
				ans.add(ch+S);
				}
				return ans;
	}
}
