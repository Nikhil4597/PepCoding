import java.util.*;
public class MapSumPairs{
    public class Node{
        Node  []children;
        boolean isEnd ;
        int val ;
    Node(){
        children = new Node [26];
        val =0;
        isEnd = false;
        }
    }
    Node root;
         
    public MapSumPairs() {
         root = new Node();
    }
    
    public void insert(String key, int val) {
        Node curr = root;
        for(int i =0;i<key.length();i++)
        {
            char ch = key.charAt(i);
            if(curr.children[ch-'a'] == null)
            {
                curr.children[ch-'a'] = new Node ();
            }
            curr.val+=val;
            curr = curr.children[ch - 'a'];
        }    
        curr.isEnd = true;
    }
    
    public int sum(String prefix) {
        Node curr = root;
        int sum = 0;
        for(int  i =0;i<prefix.length();i++)
        {
            char ch = prefix.charAt(i);
            if(curr.children[ch -'a'] == null)
            {
                return sum;
            }
            System.out.println("curr"+curr.val);
            sum+=curr.val;
            curr = curr.children[ch -'a'];
        }       
        return sum;
    }

    public static void main(String [] args)
    {
        MapSumPairs obj = new MapSumPairs ();
        obj.insert("apple",3);
        obj.insert("app",2);
         int val = obj.sum("ap");
         System.out.println(val);
    }
}