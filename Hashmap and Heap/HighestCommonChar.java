import java.util.*;
public class HighestCommonChar{
    public static void main(String [] args)
    {
            Scanner scn = new Scanner(System.in);
            String str = scn.nextLine();
            HashMap <Character,Integer> map =new HashMap<>();
            int max = Integer.MIN_VALUE;
            char  mch ='\0';
            for(int i =0;i<str.length();i++)
            {
                char ch = str.charAt(i);
                if(map.containsKey(ch)==false)
                {
                    map.put(ch,1);
                }    
                else{
                        int asf = map.get(ch);
                    map.put(ch,asf+1);
                }
                if(max<map.get(ch))
                {
                    max = map.get(ch);
                    mch = ch;
                }

            }
            System.out.println(mch);
        }
}   