import java.util.*;
public class CustomPriorityQueue{
    public static class PriorityQueue{
        boolean isMinHeap;
        ArrayList <Integer> data;
        PriorityQueue(boolean isMinHeap)
        {
            this.isMinHeap = isMinHeap;
            data = new ArrayList <>();

        }
        //-ive means priority(v1)>priority(v2)
        //+ive means priority(v1)<priority(v2)
        private int compare(int v1,int v2)
        {
            if(isMinHeap == true)
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
            // upheafy - correct  the arrangement of the tree
            upheafy(data.size()-1);

        }
        private void upheafy(int ci)
        {
            int pi = (ci-1)/2;
            if(compare(data.get(ci),data.get(pi))<0)
            {
                swap(ci,pi);
                upheafy(pi);
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
                System.out.println("Underfloww");
                return -1;
            }
            swap(0,data.size()-1);
            int rm = data.remove(data.size()-1);
            //downheapfy - help to arrage the data in manner 
            downheapfy(0);
            return rm;
        }
        private void downheapfy(int pi)
        {
            int lci = 2*pi+1;
            int rci = lci+1;
            int mpi = pi;
            if( lci <data.size()&& compare(data.get(lci),data.get(mpi))<0)
            {
                mpi = lci;
            }
            if(rci<data.size() && compare(data.get(rci),data.get(mpi))<0)
            {
                mpi = rci;

            }
            if(mpi != pi)
            {
                swap(mpi,pi);
                downheapfy(mpi);
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
        public int size()
        {
            return data.size();
        }   


    }
    public static void main(String [] args)
    {
        PriorityQueue pq = new PriorityQueue(true);
        pq.add(20);
        pq.add(10);
        pq.add(50);
        pq.add(90);
        pq.add(100);
        while(pq.size()>0)
        {
            System.out.println(pq.remove());
        }
    }
}