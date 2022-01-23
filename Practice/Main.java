import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner scn=  new Scanner(System.in);
    int  n = scn.nextInt();
    System.out.println(findAns(n));

  }
public   static int findAns(int n)
{
 int a=1;
 int b=1;
 int c=1;
  for(int i=2;i<=n;i++)
  {
    a=a*2;
    b=b*3;
    c=c*2;
  }
  return a+b+c;
}
}
