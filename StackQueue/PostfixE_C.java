import java.io.*;
import java.util.*;

public class PostfixE_C{


public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    System.out.println(eval(exp));
    // conversion(exp);
 }
public static int eval(String str)
{
  Stack <Integer> stk = new Stack <>();

  for(int i =0;i<str.length();i++)
  {
    char ch = str.charAt(i);
    if(ch=='+' || ch=='-'|| ch == '*'|| ch== '/')
    {
      int a = stk.pop();
      int b = stk.pop();
      int ans = solve(a,b,ch);
      stk.push(ans);
    }
    else{

      int val =ch-'0';
      stk.push(val);
    }
  }
  return stk.peek();
}
public static int solve(int a,int b ,char ch)
{
  if(ch=='+'){return a+b;}
  else if(ch=='-'){return a-b;}
  else if(ch=='*'){return a*b;}
  else
  {return a/b;}
}
}
