import java.util.*;
public class ReplaceWords{
    public  class Node{
        Node [] children;
        boolean isEnd;
        Node(){
            children = new Node [26];
        }
    }

    static  Node root;

    public ReplaceWords(){
        root = new Node();
    }
    public void insert(String word)
    {
        Node curr = root;
        for(int i =0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(curr.children[ch -'a'] == null)
            {
                curr.children[ch -'a'] = new Node ();
            }
            curr = curr.children[ch - 'a'];
        }
        curr.isEnd = true;
    }
    public  static  String replaceWords(List <String>dictionary,String sentence)
    {
         
        ReplaceWords obj = new ReplaceWords ();
        String [] words = sentence.split(" ");

        for(int i =0;i<dictionary.size();i++)
        {
            obj.insert(dictionary.get(i));
        }
        for(int i =0;i<words.length;i++)
        {
            String ga = searchPrefix(words[i],root);
            if(ga != null)
            {
                words[i] = ga;
            }
        }
        String ans = "";
        int size =words.length;
        for(int i=0;i<size-1;i++)
        {
            ans+=words[i]+" ";
        }
            ans+=words[size-1];
            return ans;
    }
    
    public static void main(String  [] args)
    {

        List <String> dictionary = new ArrayList <>();
        dictionary.add("cat");
        dictionary.add("rat");
        dictionary.add("bat");
        String sentence = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dictionary,sentence));
    }
}