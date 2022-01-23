import java.util.*;
public class BalBrac{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(balBrac(str));
    }
    public static boolean balBrac(String str){
        Stack <Character> stk = new Stack <>();
        for(int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == ')')
            {
                if(stk.peek() =='(' && stk.size()!=0)
                {
                    stk.pop();
                }
                else {
                    return false;
                }
            }
            else if(ch == '}')
            {
                if(stk.peek()=='{'&& stk.size()!=0)
                {
                    stk.pop();
                }
                
                else  {
                    return false;
                }
            }
            else if(ch ==']')
            {
                if(stk.peek()=='['&& stk.size()!=0)
                {
                    stk.pop();
                }
                else{
                    return false;
                }
            }
           else  if(ch == '(' ||ch =='{'||ch=='['){
                stk.push(ch);
            }
        }
        if(stk.size()>0)
        {
            return false;
        }
        return true;
    }
}