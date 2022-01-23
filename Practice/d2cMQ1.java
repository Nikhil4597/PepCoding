import java.util.*;
public class d2cMQ1{
  public static void main(String [] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    String str = scn.nextLine();

    // int noq = scn.nextInt(); //no. of quary
    //
    // int [] [] quary = new int [noq][2];
    // for(int i =0;i<noq;i++)
    // {
    //   quary[i][0] = scn.nextInt();
    //   quary[i][1] = scn.nextInt();
    // }
    int L = scn.nextInt();
    int R = scn.nextInt();
    //for(int i =0;i<quary.length;i++)
    {
      findSub(str,L,R);
  }
}
  public static void  findSub(String str,int L,int R)
  {
    for(int i =L;i<R+1 && i+1<=R;i++)
    {   char ch = str.charAt(i);
      String str1 = ch + str.substring(L,i)+str.substring(i+1,R);
      System.out.println(str1);
    }
  }
  public static boolean helpPalin(String str,int i,int j)
  {
    while(i<j)
    {
      if(str.charAt(i)!=str.charAt(j))
      {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
