import java.util.*;
public class MergekSortedList{
    public static class Pair implements Comparable <Pair>{
        int ln;
        int idx;
        int val;
        Pair(int ln,int idx,int val)
        {
            this.ln = ln;
            this.idx = idx;
            this.val = val;

        }
        public int compareTo(Pair op)
        {
            return this.val-op.val;
        }
    }
    public static void main(String [] args)
    {
        Scanner scn  = new Scanner(System.in);
        int k = scn.nextInt();

        ArrayList <ArrayList<Integer>> lists = new ArrayList<>();
        for(int i =0;i<k;i++)
        {
            int n = scn.nextInt();
            ArrayList <Integer> list = new ArrayList <>();
            for(int j =0;j<n;j++)
            {
                int temp = scn.nextInt();
                list.add(temp);
            }
            lists.add(list);
        }
        ArrayList<Integer> ans = getSortedList(lists);
        for(int as:ans)
        {
            System.out.print(as+" ");
        }
        System.out.println();
    }
    
    public static ArrayList <Integer> getSortedList(ArrayList<ArrayList<Integer>> lists)
    {
        PriorityQueue <Pair> pq = new PriorityQueue <>();
        ArrayList <Integer> ans = new ArrayList <> ();
        for(int i = 0;i<lists.size();i++)
        {
            pq.add(new Pair(i,0,lists.get(i).get(0)));
        }
        while(pq.size()>0)
        {
            Pair rm = pq.remove();
            ans.add(rm.val);
            int ln = rm.ln;
            int idx = rm.idx+1;
            if(idx < lists.get(ln).size())
            {
                pq.add(new Pair(ln,idx,lists.get(ln).get(idx)));
            } 
        }
        return ans;
    }
}