import java.util.*;
public class DubliBrac{
  public static void main(String [] args)
  {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    System.out.println(isDubli(str));
  }
  public static boolean isDubli(String str){
    Stack <Character> stk = new Stack <>();
    for(int i =0;i<str.length();i++)
    {
      char ch = str.charAt(i);
     if(ch ==')')
     {
       int count =0;
       while(stk.peek()!='('){
         count++;
         stk.pop();
       }
       if(count==0)
       {
         return true;
       }
       stk.pop();

     }
      else if(ch!=' ')
      {
        stk.push(ch);
      }
    
    }
    return false;
  }
}
