import java.util.*;
public class Main{
	public static class Node{
		int data;
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
					System.out.print(temp.data+" ");
					temp = temp.next;
					
					}
					System.out.println();
					
				}
				int size()
				{
					return size;
					}
				void push(int val)
				{
					Node newNode = new Node();
					newNode.data = val;
					if(head == null)
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
					void reverse()
					{
						Node prev = null;
						Node curr = head;
						Node temp = new Node ();
						while(curr!= null)
						{
							temp = curr.next;
							curr.next = prev;
							prev  = curr;
							curr = temp;
							}
							Node temp1 = tail;
							
							tail =head ;
							head = temp1;
							
						}
			}
			public static void main(String [] args)
			{
				Scanner scn = new Scanner(System.in);
				
				int val = scn.nextInt();
				LL list = new LL ();
				
				while(val != -1)
				{
					list.push(val);
					val = scn.nextInt();
					}
					
					System.out.println(list.size());
					list.show();
					list.reverse();
					list.show();
				}
	}
