import java.util.*;
public class InfixEvalution{
  public static void main(String [] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    System.out.println(infixEval(exp));

  }
  public static int calculate(int a,int b,char sym)
  {
    if(sym =='+'){return a+b;}
      else if(sym =='-'){return a-b;}
        else if(sym =='*'){return a*b;}
          else if(sym =='/'){return a/b;}
          else return -1;
  }
  public static int  upper(char ch)
  {
    if(ch=='+' || ch=='-')
    {
      return 1;
    }
    else if(ch=='*' || ch=='/')
    {
      return 2;
    }
    else return -1;
  }
  public static int infixEval(String str)
  {
    Stack<Integer> var =new Stack <>();
    Stack<Character> sym = new Statck<>();
    for(int i =0;i<str.length();i++)
    {
      char ch = str.charAt(i);
      if(ch>='0' && ch<=9)
      {
        var.push(ch-'0');
    }else if(ch=='(')
    {
      sym.push(ch);
    }else if(ch==')')
    {
      while(sym.peek()!='(')
      {
        int Rval = sym.pop();
        int Lval = sym.pop();
        char optr = sym.pop();
        int val = calculate(Lval,Rval,optr);
        var.push(val);
      }
      sym.pop();

    }else if(ch =='+'||ch=='-'||ch=='*'||ch=='/')
    {
      while(sym.size()>0 && sym.peek()!='(' && upper(sym.peek)>=upper(ch))
      {
        int Rval = sym.pop();
        int Lval = sym.pop();
        char optr = sym.pop();
        int val = calculate(Lval,Rval,optr);
        var.push(val);
      }
      sym.pop();

    }

      }

      return var.peek();
    }
    }
