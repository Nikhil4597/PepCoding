import java.util.*;
public class Q1d2c{
  public static void main(String [] args)
  {
  Scanner scn = new Scanner(System.in);
  int t = scn.nextInt();

  for(int i =1;i<=t;i++)
    {
      int n = scn.nextInt();
        String str = scn.next();

        System.out.println(ans(str));
    }

  }
  public static String ans(String str)
  {
    String str1 = "BAZINGA0";
    int j=0;

    for(int i=0;i<str.length()&& str1.charAt(j)!='0';i++)
    {
      if(str.charAt(i)==str1.charAt(j))
      {
        j++;
      }
    }
    if(str1.charAt(j)=='0')
    {
      return "YES";
    }
    else
    {
      return "NO";
    }
  }
}
