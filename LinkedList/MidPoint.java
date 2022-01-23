import java.util.*;
public class MidPoint{
	public static class Node{
		int data;
		Node next;
		}
		public static class LL{
			Node head;
			Node tail;
			int size;
			void show(){
				Node temp = head;
				while(temp!=null)
				{
					System.out.print(temp.data+" ");
					temp=temp.next;
					}
					System.out.println();
				}
				int size()
				{
					return  size;
					}
				void push(int  val)
				{
					Node newNode = new Node ();
					newNode.data =val;
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
				int mid(){
					Node full = head; 
					Node half = head;
					while(  full.next != null && full.next.next != null)
					{
						full = full.next.next;
						half = half.next;
						}
						return  half.data;
					}
			}
			public static void main(String [] args)
			{
				Scanner scn = new Scanner(System.in);
				int val = scn.nextInt();
				LL list  = new LL ();
				while(val!=-1)
				{
					list.push(val);
					val = scn.nextInt();
					
					}
					list.show();
					System.out.println(list.size());
				System.out.println(list.mid());
				}
			
	}
