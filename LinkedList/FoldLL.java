import java.util.*;
public class Main{
	public static class Node {
		int data;
		Node next;
		}
	public static class LinkedList{
		Node head ;
		Node tail;
		
		int size;
		int size()
		{
			return size;
			}
		void push(int val)
		{
			Node newNode = new Node ();
			newNode.data = val;
			if(head == null)
			{
				head = newNode;
				tail = newNode;
				
			}
				
			else
			{
					tail.next= newNode;
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
		
		Node ln;
		public void  fold(){
				ln = head;
				helpToFold(head,0);
			}
			private void helpToFold(Node rn,int lvl)
			{
				if(rn == null)
				{
					return;
					}
				helpToFold(rn.next,lvl+1);
				if(lvl>size/2){
				Node temp = ln.next;
				ln.next = rn;
				rn.next = temp;
				ln = temp;
							}
				else if(lvl== size/2)
				{
					tail = rn;
					rn.next = null;
					}
			}
		}
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		LinkedList list = new LinkedList();
		
		int val = scn.nextInt();
		while(val != -1)
		{
			list.push(val);
			val = scn.nextInt();
		}
		
		list.show();
		System.out.println(list.size());
		list.fold();
		list.show();
		System.out.println(list.size());
	}
}
