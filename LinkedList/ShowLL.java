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
			Node temp = this.head;
			while(temp!=null)
			{
				System.out.println(temp.data+" ");
				temp=temp.next;
				}
				System.out.println();
				
			}
		int size()
		{
			return size;
			}
			void input(int val)
			{
				Node newNode = new Node();
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
			}
			public static void main(String[] args)
			{
				Scanner scn = new Scanner(System.in);
				LL list = new LL();
				list.input(10);
				list.input(20);
				list.input(30);
				list.input(40);
				list.input(50);
				list.input(60);
				list.show();
				System.out.println(list.size());
				
				}
		
	}
