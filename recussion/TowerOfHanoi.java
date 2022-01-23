import java.util.*;
public class TowerOfHanoi{
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int t1 =scn.nextInt();//tower 1 id
		int t2 = scn.nextInt();//tower 2 id
		int t3 = scn.nextInt();//tower 3 id
		
		toh(n,t1,t2,t3);
		}
		public static void toh(int n ,int t1id,int t2id,int t3id)
		{
			if(n ==0)
			{return;}
			toh(n-1,t1id,t3id,t2id);
			System.out.println(n+"["+t1id+"->"+t2id+"]");
			toh(n-1,t3id,t2id,t1id);
			}
	}
