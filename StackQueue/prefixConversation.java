import java.io.*;
import java.util.*;

public class prefixConversation{


public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    conversation(exp);
 }
 public static void conversation(String str)
 {
   Stack <Character> oprst = new Stack<>();
   Stack<String> pre = new Stack<>();
   Stack <String> post = new Stack<>();
   for(int i =0;i<str.length;i++)
   {
     char ch = str.charAt(i);
     if(ch=='(')
     {
       oprst.push(ch);
     }
     else(ch ==')')
     {
       while(oprst.peek()!='(')
       {
         char optr = oprst.pop();
         String preR = pre.pop();
         String preL = pre.pop();
         String preV = optr+preR+preL;
         pre.push(preV);
        String postR = post.pop();
        String postL = post.pop();
        String postV = postL+postR+postV;
        post.push(postV);

       }
       oprst.pop();
     }

   }
 }
}
