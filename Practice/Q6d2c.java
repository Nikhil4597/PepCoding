import java.util.*;
public Q6d2c{
  public static void main(String [] args){
  Scanner scn = Scanner(System.in);
  int t = scn.nextInt();
  for(int i =1;i<=t;i++){
    int n = scn.nextInt();
    String str = scn.next();
    System.out.println(findAns(str));
  }
}
public static String findAns(String str){
int a =0;
int b =0;
  for(int i =0;i<str.length();i++)
  {
    if(str.charAt(i)=='A')
    {
      a++;
    }
    else if(str.charAt(i)=='B')
    {
      b++;
    }
  }
  if(a>b)
  {return "1";}
    else if(b<a){return "2";}
      else{return "3";}
}
}
