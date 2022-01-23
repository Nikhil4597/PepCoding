import java.util.*;
public class AddEle{
	public static class  Node{
		int data;
		Node next;
	}
	public static class LinkedList{
		Node head;
		Node tail;
		int size;
		void addLast(int val){
	Node newNode = new Node();
	newNode.data = val;
	 
		if(size ==0)
		{
			head = tail = newNode;
			
		}
		else
		{
			tail.next = newNode;
			tail =newNode;
		}

		size++;

	}	
	}
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		LinkedList list  = new LinkedList();

		int val = scn.nextInt();
		while(val!=-1)
		{
			list.addLast(val);
			val = scn.nextInt();
		}
		show(list);
	}
	 
	public static void show (LinkedList list)
	{
		for(Node temp=list.head;temp!=null;temp =temp.next)
		{
			System.out.println(temp.data);
		}
		System.out.println(list.size);
	}
}

