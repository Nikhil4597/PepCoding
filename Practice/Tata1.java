import java.util.*;
public class Tata1{
  public static void main(String [] args)
  {
    Scanner scn = new Scanner(System.in);
    String str1= scn.nextLine();
    String str2 = scn.nextLine();
    System.out.println(commonChar(str1,str2));
  }
  public static String commonChar(String str1,String str2){
  char [] ch1 = new char [str1.length()];
  char [] ch2 = new char [str2.length()];
  for(int i =0;i<str1.length();i++)
  {
    char ch = str1.charAt(i);
    ch1[i] =ch;
  }  for(int i =0;i<str2.length();i++)
    {
      char ch = str2.charAt(i);
      ch2[i] =ch;
    }
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    String ans ="";
    int i=0;
    int j =0;
    while(i<str1.length()-1 && j<str2.length()-1)
    {
      if(ch1[i]==ch2[j])
      {
        ans+=ch1[i];
        i++;j++;
      }
      else if(ch1[i]<ch2[j])
      {
        i++;
      }
      else{
        j++;
      }
    }
    return  ans;
  }
}
