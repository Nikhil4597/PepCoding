import java.util.*;
public class ShowReverse {
    public static class Node{
        int data;
        Node next;
    } 
    public static class LL {
        Node head ;
        Node tail;
        int size;
        void push(int val)
        {
            Node newNode = new Node();
            newNode.data = val;
            if(head == null)
            {
                head = newNode;
                tail = newNode;
            }
            else
            {
                tail.next = newNode;
                tail = newNode;
            }
            size++;

        }
        void show()
        {
            Node temp =head ;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();

        }
        int size()
        {

            return size;
        }
        
        void showUlta(Node rn){
            if(rn==null)
            {
                return;
            }
            showUlta(rn.next);
            System.out.print(rn.data+" ");

        }
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        LL list = new LL ();
        int val = scn.nextInt();
        while(val!= -1)
        {
            list.push(val);
            val = scn.nextInt();
        }
        System.out.println(list.size());
        list.show();
        list.showUlta(list.head);
        System.out.println();
    }
    
}
