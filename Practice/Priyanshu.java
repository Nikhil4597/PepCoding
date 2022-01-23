import java.util.*;
public class Priyanshu{
  public static void main(String[] args) {
    Scanner scn=  new Scanner(System.in);
    String str = scn.nextLine();
      char ch = str.charAt(0);
      int idx =0;
      for(int i = str.length()-1;i>=0;i--)
      {
        if(str.charAt(i)==ch)
        {
          idx = i;
          break;
        }
      }
      if(idx==0)
      {
        System.out.println(idx);
      }
      else{
      System.out.println(idx-1);
    }
  }
}
