import java.io.*;
import java.util.*;

public class kpc{
static String [] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) throws Exception {
	Scanner scn = new Scanner(System.in);
	String str = scn.next();
	ArrayList <String> ans = getKPC(str);
	System.out.println(ans);
    }

    public static ArrayList<String> getKPC(String str) {
    if(str.length()==0)
    {
		ArrayList<String> ra =new ArrayList<>();//return ans
		ra.add("");
		return ra;
		}
    char ch =str.charAt(0); 
    String rest_str =str.substring(1);
    ArrayList <String> fn=getKPC(rest_str);//find next
    ArrayList <String> fa = new ArrayList<>();//final ans
    String short_ans = arr[ch-'0'];
    for(int j=0;j<short_ans.length();j++)
    {	char temp = short_ans.charAt(j);
	
    for(int i = 0;i<fn.size();i++)	
		{
			fa.add(temp+fn.get(i));
			}
	}
	return fa;
}

}
