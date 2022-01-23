import java.util.*;
public class CreateHashMap{
    public static class HashMap<K,V>{
        private class HMNode{    
            K key;
            V value;
        
        HMNode(K key ,V value)
        {
            this.key = key ;
            this.value = value;
        }
    }
    }
    private int size;
    private LinkedList <HMNode> [] bucket;
    public HashMap(){
        initbuket(4);
        size =0;
    }
   private void initbuket(int N)
   {
       bucket = new LinkedList[N];
       for(int i =0;i<bucket.length;i++)
       {
           bucket[i] = new LinkedList <>();

       }
   }
   public void put(K key ,V value)throws Exception
   {
       int bi =findBucketIndex(key); //bucket Index
       int di = findWithin(key,bi);//linkedList position 
       if(di == -1)
       {
           //insertion beheviour
            HMNode node = new HMNode(key,value);
            bucket[bi].add(node);
            size++;

       }
       else{
           //put change data behaviour
           HMNode node = bucket[bi].get(di);
           node.value = value;

       }
       double  lambda = size*1.0/bucket.length;
       if(lambda>2.0)
       {
           reHash();
       }
   }
   private void reHash() throws Exception
   {
       ArrayList <HMNode> [] old_bucket = bucket;
       initbuket(old_bucket.length*2);
       size=0;
       for(int i =0;i<old_bucket.length;i++)
       {
           for(int j =0;j<old_bucket[i].length;i++)
           {
               HMNode node = old_bucket[i].get(j);
               put(node.key,node.value);
           }

       }
   }
   private int  findBucketIndex(K key)
   {
       int hc = key.hashCode();
       int bi = (Math.abs(hc))% bucket.length;
        return bi;
   }
   private  int findWithin(K key ,int bi)
   {
       for(int i =0;i<bucket.bi.size();i++)
       {
           HMNode node = bucket[bi].get(i);
        //    if(node.key ==key) // if key = String then this code is not working well
        if(node.key.equals(key)== true)
           {
               return i;
           }
       }
       return -1;
   }
   public V get(K key)
   {
       int bi = findBucketIndex(key);
       int di = findWithin(key,bi);
       if(di ==-1)
       {
           return null;
       }
       else{
           HMNode node  = bucket[bi].get(di);
           return node.value;
       }

   }
   public boolean containKey(K key)
   {
       int bi = findBucketIndex(key);
       int di = findWithin(key,bi);
       if(di == -1)
       {
           return false;
       }
       else{
           return true;
       }
   }
   public V remove(K key)
   {
       int bi = findBucketIndex(key);
       int di = findWithin(key,bi);
       if(di == -1)
       {
           return null;
       }
       else{
           HMNode node = bucket[bi].remove(di);
            size--;

           return node.value;
       }
   }
   public ArrayList <K> keyset(){
        ArrayList <K> keys = new ArrayList<>();

        for( int i =0;i<bucket.length;i++)
        {
            for(HMNode node :bucket[i])
            {
                keys.add(node.key);
            }
        }
   }
   public int size(){
       return size;
   }

}