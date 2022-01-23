import java.io.*;
import java.util.*;

public class GetMazePathsWithJump {

    public static void main(String[] args) throws Exception {
		Scanner scn =new Scanner(System.in);
		int n =scn.nextInt();
		int m = scn.nextInt();
		ArrayList<String> ans = getMazePaths(0,0,n-1,m-1);
		System.out.println(ans);
    }

    // sr - source row
    // s-c - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
		if(sr==dr&&sc==dc)
		{
			ArrayList <String> sol = new ArrayList<>();
			sol.add("");
			return sol;
			}
			if(sr>dr||sc>dc)
			{
				ArrayList <String> sol =new ArrayList<>();
				return sol;
				}
		ArrayList<String>ans = new ArrayList<>();
		for(int i =1;i<=dc;i++)
		{
			ArrayList<String> colStep = getMazePaths(sr,sc+i,dr,dc);
			
			for(int j =0;j<colStep.size();j++)
			{
				ans.add("h"+i+colStep.get(j));
				}
			}
		for(int i =1;i<=dr;i++)
		{
			ArrayList <String> rowStep = getMazePaths(sr+i,sc,dr,dc);
			for(int j=0;j<rowStep.size();j++)
			{
				ans.add("v"+i+rowStep.get(j));
				
				}
			}
		
			 
			
			for(int i =1;i<=dr&&i<=dc;i++)
			{
				ArrayList<String> diaStep = getMazePaths(sr+i,sc+i,dr,dc);
				for(int j=0;j<diaStep.size();j++)
				{
					ans.add("d"+i+diaStep.get(j));
					}
				}
			return ans;
    }

}
