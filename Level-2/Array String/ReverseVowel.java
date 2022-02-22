import java.util.*;
public class ReverseVowel{
    public static String reverseVowel(String s)
    {
        HashMap <Character,Integer> map  = new HashMap<>();
        map.put('a',1);
        map.put('e',1);
        map.put('i',1);
        map.put('o',1);
        map.put('u',1);
        map.put('A',1);
        map.put('E',1);
        map.put('I',1);
        map.put('O',1);
        map.put('U',1);
        char [] str = s.toCharArray();
        int i =0;int j = s.length()-1;
        while(i<j)
        {
            if(map.containsKey(str[i])&& map.containsKey(str[j]))
            {
                swap(str,i,j);
                i++;
                j--;
            }
            else if(!map.containsKey(str[i]))
            {
                i++;

            }
            else if(!map.containsKey(str[j]))
            {
                j--;

            }
        }
        String ans ="";
        for(char ch :str)
        {
            ans+=ch;
            }

        return ans ;
    }
    public static void swap(char [] str,int i,int j)
    {
        char val = str[i];
        str[i] = str[j];
        str[j] = val;
    }

    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(reverseVowel(str));
    }
}