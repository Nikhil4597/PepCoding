import java.util.*;
public class MakePQbyHeap{
    public static class PriorityQueue{
        boolean isMinHeap;
        ArrayList <Integer> data;
        PriorityQueue(boolean isMinHeap)
        {
            data = new ArrayList <Integer>();
            this.isMinHeap = isMinHeap;
        }
        // -1 if(priority(v1)>priority(v2))
        // 1 if(priority(v1)<priority(v2))
        
        private int compare(int v1,int v2)
        {
            if(isMinHeap==true)
            {
                return v1-v2;

            }
            else{
                return v2-v1;
            }
        }
        public void add(int val)
        {
            data.add(val);
            //arrange things with upheapfy
            upHeapfy(data.size()-1);
        }
        private void upHeapfy(int ci)
        {
            if(ci==0)
            {
                return; 
            }
            int pi = (ci-1)/2;
            if(compare(data.get(ci),data.get(pi))<0)
            {
                swap(pi,ci);
                upHeapfy(pi);
            }
        }
        private void swap(int i,int j)
        {
            int ival = data.get(i);
            int jval = data.get(j);
            data.set(i,jval);
            data.set(j,ival);

        }
        public int remove()
        {
            if(size()==0)
            {
                System.out.println("Underflow");
                return -1;
            }
            swap(0,data.size()-1);
            int rm = data.remove(data.size()-1);
            //Arrange the by down heapfy
            downHeapfy(0);
            return rm;
        }
        private void downHeapfy(int pi)
        {
            int lci = 2*pi+1;
            int rci = lci+1;
            int mpei = pi; //most prioritized element idx
            if(lci<data.size()&& compare(data.get(lci),data.get(mpei))<0)
            {
                mpei = lci;
            }
            if(rci<data.size() && compare(data.get(rci),data.get(mpei))<0)
            {
                mpei = rci;
            }
            if( mpei!=pi)
            {
                swap(pi,mpei);
                downHeapfy(mpei);
            }

        }
        public int peek()
        {
            if(size()==0)
            {
                System.out.println("Underflow");
                return -1;
            }

            return data.get(0);
        }
        public int size(){
            return data.size();
        }
    }
    public static void main(String [] args)
    {
         PriorityQueue pq = new PriorityQueue (true);
         pq.add(10);
         pq.add(20);
         pq.add(30);
         pq.add(40);
        //  System.out.println(pq.peek());
         pq.add(50);
         while(pq.size()>0)
         {
             System.out.println(pq.remove());
         }
    }
}