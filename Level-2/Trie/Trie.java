import java.util.*;
public class Trie{
    public class Node{
        Node [] children;
        boolean isEnd;
        Node(){
            children = new Node [26];
        }
    }
    Node root ;

    public Trie(){
        root = new Node();
    }

    public void insert(String word) {
        Node curr = root;
        for(int i =0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(curr.children[ch-'a'] == null)
            {
                curr.children[ch-'a'] = new Node();

            }
            curr = curr.children[ch-'a'];
        }
        curr.isEnd = true;
    }
    
    public boolean search(String word) {
        Node curr = root;
        for(int i =0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(curr.children[ch -'a'] == null)
            {
                return false;
            }
            curr = curr.children[ch - 'a'];
        }
        return curr.isEnd;
    }
    
    public boolean startsWith(String prefix) {
      Node curr = root;
      for(int i =0;i<prefix.length();i++)
      {
          char ch = prefix.charAt(i);
          if(curr.children[ch -'a'] == null)
          {
              return false;
          }
          curr = curr.children[ch - 'a'];

      }  
      return true;
    }


    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        Trie obj = new Trie ();
        String []  S = {"trie","appy","search","apple","app"};
        for(int i =0;i<S.length;i++)
        {
            obj.insert(S[i]);
        }
        System.out.println(obj.search("app"));
        System.out.println(obj.startsWith("apple"));



    }
}