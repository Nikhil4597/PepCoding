import java.util.*;
public class Main{
	public static class Node{
		int data ;
		Node next;
		
		}
		public static class LL{
			Node head;
			Node tail;
			int size;
			void show()
			{
				Node temp = head;
				while(temp!=null)
				{
					System.out.println(temp.data);
					temp = temp.next;
				}
			}
			int size()
			{
				return  size;
				}
			void addLast(int val)
			{
				Node newNode  = new Node();
				newNode.data = val;
				if(head ==null)
				{
					head = tail = newNode;
					}
					else
					{
						tail.next = newNode;
						tail = newNode;
						}
						size++;
						
				}
				void addFirst(int val)
				{
					Node newNode = new Node();
					 newNode.data = val;
					 newNode.next = head;
					 head = newNode;
					size++;
					}
			}
				public static void main(String [] args)
				{
					LL list = new LL();
					list.addLast(1);
					list.addLast(2);
					list.addLast(3);
					list.addLast(5);
					list.addFirst(65);
					list.show();
					System.out.println(list.size());
					
					}
	}
