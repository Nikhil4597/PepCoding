import java.util.*;
public class MediamPQ{
    public static class mediamPQ{
        PriorityQueue <Integer> left;
        PriorityQueue <Integer> right;
        public mediamPQ(){
            left = new PriorityQueue <> (Collections.reverseOrder());
            right = new PriorityQueue <>();
        }   
        public void add(int val)
        {
          if(size()==0)
          {
              left.add(val);
          }
          else if(left.size() == 0 || left.peek()<val)
          {
              right.add(val);
          }
          else{
              left.add(val);
          }

          if(left.size()-right.size()==2)
          {
              right.add(left.remove());
          }
          else if(right.size()-left.size()==2){
              left.add(right.remove());
          }
        }
        public int remove(){
            if(size()==0)
            {
                System.out.println("UnderFolw");
                return -1;

            }
            else if(left.size()>= right.size())
            {
                return left.remove();
            }
            else  {
                return right.remove();
            }
        }
        public int peek(){
            if(size()==0)
            {
                System.out.println("UnderFlow");
                return -1;
            }
            else if(left.size()>=right.size())
            {
                return left.peek();
            }
            else{
                return right.peek();
            }
        }
        public int size(){
            return left.size()+right.size();
        }
    }
    public static void main(String [] args)
    {
        mediamPQ sol = new mediamPQ ();
                sol.add(10);
                sol.add(20);
                sol.add(30);
                sol.add(40);
                System.out.println(sol.peek());
                sol.add(50);
                System.out.println(sol.peek());
                System.out.println(sol.remove());
                System.out.println(sol.peek());
                System.out.println(sol.remove());
                System.out.println(sol.peek());
                                System.out.println(sol.remove());
                System.out.println(sol.peek());
                                System.out.println(sol.remove());
                  System.out.println(sol.peek());   
    }
}