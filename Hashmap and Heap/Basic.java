import java.util.*;
public class Basic{
    public static void main(String [] args)
    {
        HashMap <String,Integer> map = new HashMap<>();
        //put function for insertation
        map.put("India",450);
        map.put("Pak",350);
        map.put("Africa",400);
        map.put("Afg",400);
        System.out.println(map);
        //put function for change
        map.put("India",500);
        map.put("USA",0);
        System.out.println(map);
        //get function for get data or value
        int val = map.get("India");
        
        System.out.println(val);
        System .out.println(map.get("Aug"));
        //remove function for delete pair from map
        int rm =map.remove("Pak");
        System.out.println(rm);
        System.out.println(map);
        // contain key function for know is key present or not;
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Pak"));
    // keySet is a set in all keys

    for(String ele:map.keySet())
    {
        System.out.println(ele+" "+map.get(ele));
    }
    }
}