import java.util.*;
public class Tata2{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    System.out.println(findCode(str));
    }
public static String findCode(String str)
{
  String ans ="";
  // char [] ch = new char [str.length()];
  for(int i =0;i<str.length();i++)
  {
  char  ch = str.charAt(i);
    int k =(int)ch+5;
   k =k%122;

   if(k<97){
   k = k+'a'-1;
 }
  ch = (char)k;
    ans+=ch;
  }

  return ans;
}
}
