import java.util.*;
public class Q_14{
public static void main(String [] args)
{   
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    int ans = countEncoding(str);
    System.out.println(ans);
}
public static int countEncoding(String s)
{
    int  [] dp = new int [s.length()+1];
    dp[0] =1;
    dp[1] = s.charAt(0)!=0?1:0;
    for(int i =2;i<=s.length();i++)
    {
        int fp = Integer.parseInt(s.substring(i-1,i));//first place
        int sp = Integer.parseInt(s.substring(i-2,i));///second place
        if(fp>0 && fp<10)
        {
            dp[i]+=dp[i-1];

        }
        if(sp>9 && sp<27)
        {
            dp[i]+=dp[i-2];
        }
    }
return dp[s.length()];

}
}
