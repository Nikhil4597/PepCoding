import java.io.*;
import java.util.*;

public class Q_2 {

    public static void main(String[] args) throws Exception {
	Scanner scn =new Scanner(System.in);
	int n = scn.nextInt();
	int ans =stairPath(n);
	System.out.println(ans);


    }
//Recursive Approach
	public static int stairPath(int n)
{
	if(n==0)
	{return 1;}
	if(n<0)
	{return 0;}
	int nm1 =stairPath(n-1);
	int nm2 = stairPath(n-2);
	int nm3 = stairPath(n-3);
	int nop =nm1+nm2+nm3;//num of paths
return nop;
}

}
