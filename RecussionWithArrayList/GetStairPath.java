import java.io.*;
import java.util.*;

public class GetStairPath {

    public static void main(String[] args) throws Exception {
	Scanner scn = new Scanner(System.in);
	int n =scn.nextInt();
	ArrayList <String> ans = getStairPaths(n);
	System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {
	if(n==0)
	{
		ArrayList<String> ra= new ArrayList<>();
		ra.add("");
		return ra;
		}
		if(n<0)
		{
			ArrayList <String> spc =new ArrayList<>();
			return spc;
			}
	ArrayList <String> nm1 =getStairPaths(n-1);//paths from n-1 stair
	ArrayList <String> nm2 =getStairPaths(n-2);//paths from n-2 stair
	ArrayList <String> nm3 =getStairPaths(n-3);//paths from n-3 stair
	ArrayList <String> ans =new ArrayList<>();
	for(int i =0;i<nm1.size();i++)
	{
		ans.add('1'+nm1.get(i));
		}
			for(int i =0;i<nm2.size();i++)
	{
		ans.add('2'+nm2.get(i));
		}
			for(int i =0;i<nm3.size();i++)
	{
		ans.add("3"+nm3.get(i));
		}
		return ans;
    }

}
