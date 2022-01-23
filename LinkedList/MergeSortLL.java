import java.util.*;
public class Main{
	public static class Node{
		int data;
		Node next;
		}
		public static class LinkedList{
			Node head;
			Node tail;
			int size;
			int size()
			{
				return size;
				}
			void add(int val)
			{
				Node  newNode = new Node();
				newNode.data = val;
				
				if(head == null)
				{
					head= newNode;
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
				Node temp = head;
				while(temp!=null)
				{
					System.out.print(temp.data+" ");
					temp = temp.next;
					
				}
				System.out.println();
				
			}
	}
	public static LinkedList merge(LinkedList one ,LinkedList two)
	{
		LinkedList newList = new LinkedList();
		Node n1 = one.head;
		Node n2  = two.head;
		while(n1 != null && n2 != null)
		{
			if(n1.data<n2.data)
			{
				newList.add(n1.data);
				n1 =n1.next; 
				}
			else
			{
				newList.add(n2.data);
				n2 = n2.next;	
				}
			}
			while(n1!=null)
			{
				newList.add(n1.data);
				n1 = n1.next;
				}
				while(n2!=null)
				{
					newList.add(n2.data);
					n2 = n2.next;
					}
		return newList;
		}
		public static Node midNode(Node head ,Node tail)
		{
			Node slow = head;
			Node fast = head;
			while(fast !=tail && fast.next!= tail)
			{
				fast = fast.next.next;
				slow = slow.next;
				}
				return slow;
				
			}
		public static LinkedList mergeSort(Node head,Node tail)
		{
			if(head == tail)
			{
				LinkedList sort = new LinkedList();
				sort.add(head.data);
				return sort;
				}
				Node mid = midNode(head,tail);
				LinkedList left  = mergeSort(head,mid);
				LinkedList right = mergeSort(mid.next,tail);
				LinkedList ans = merge(left,right);
				return ans;
			}
	public static void main(String [] args)
	{
		LinkedList l1 = new LinkedList ();
		LinkedList l2 = new LinkedList ();
		Scanner scn = new Scanner(System.in);
			int val  = scn.nextInt();
			while(val != -1)
			{
				l1.add(val);
				val = scn.nextInt();
				}
			l1 = mergeSort(l1.head,l1.tail);
			l1.show();
			System.out.println(l1.size());
		 
}
}
