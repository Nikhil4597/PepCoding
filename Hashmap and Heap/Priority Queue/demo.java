import java.util.*;
public class demo{
    public static class Pair implements Comparable<Pair>{
        int data;
        String name;
        Pair(int data,String name)
        {
            this.data = data;
            this.name = name;
        }
        // this >0 -> +ive
        // this <0 -> -ive
        // this ==0 -> 0
        public int compareTo(Pair p)
        {
             return this.data-p.data;
        }

    }
    public static void main(String [] args)
    {
        //primitive type data
        PriorityQueue <Integer> pq = new PriorityQueue <> ();
      //  PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //arrange in increasing orde
        pq.add(21);
        pq.add(1);
        pq.add(12);
        pq.add(15);
        pq.add(18);
    
        while(pq.size()>0)
        {
            int ans = pq.peek();
            pq.remove();
            System.out.println(ans);

        }
        PriorityQueue <Pair> pq1 = new PriorityQueue <>();
        pq1.add(new Pair(123,"Rohit"));   
        pq1.add(new Pair(132,"Rohit"));   
        pq1.add(new Pair(145,"Rohit"));   
        pq1.add(new Pair(133,"Rohit"));   
        pq1.add(new Pair(122,"Rohit"));
        while(pq1.size()>0){
            Pair temp = pq1.peek();
            pq1.remove();
            System.out.println(temp.data+" "+temp.name);
        }

     }

}