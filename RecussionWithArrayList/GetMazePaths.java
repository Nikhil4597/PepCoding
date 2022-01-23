import java.io.*;
import java.util.*;

public class GetMazePaths{

    public static void main(String[] args) throws Exception {
		Scanner scn =new Scanner(System.in);
		int n =scn.nextInt();
		int m = scn.nextInt();
		ArrayList<String> ans =getMazePaths(0,0,n-1,m-1);
		System.out.println(ans);
	
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
		
		if(sr==dr && sc==dc)
		{
			ArrayList<String> sol = new ArrayList<>();
			sol.add("");
			return sol;
			}
			if(sr>dr||sc>dc)
			{
				ArrayList<String>sol =new ArrayList<>();
				return sol ;
				}
				ArrayList<String>colStep =getMazePaths(sr,sc+1,dr,dc);
				ArrayList<String> rowStep =getMazePaths(sr+1,sc,dr,dc);
				ArrayList<String> result = new ArrayList<>();
		
		for(int i =0;i<colStep.size();i++)
		{
			result.add("h"+colStep.get(i));
			}
			
		for(int i =0;i<rowStep.size();i++)
		{
			result.add("v"+rowStep.get(i));
			} 
			
		
			return result;
    }

}
