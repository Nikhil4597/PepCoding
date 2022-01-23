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
			Node ln ;
			int size()
			{
				return size;
				}
				
			  void  push(int val)
				{
					Node newNode = new Node ();
					newNode.data = val;
					if(head == null)
					{
						head = newNode;
						tail = newNode;
						}
						else{
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
					void reverse()
					{ 
						helpToReverse(head);
						head.next = null;
						Node temp = head;
						
						head = tail;
						tail  = temp;
					 }
					 void helpToReverse(Node prev)
					 {
						 if(prev.next == null)
						 {
							 return ;
							 }
						 helpToReverse(prev.next);
						 Node curr = prev.next;
						  curr.next = prev;
						  
						 }
							
					
			} 
		public static void main(String [] args)
		{
			LL list  = new LL ();
			Scanner scn = new Scanner(System.in);
			int input = scn.nextInt();
			while(input!= -1)
			{
				list.push(input);
				input = scn.nextInt();
				}
			System.out.println(list.size());
			list.show();
			list.reverse();
			list.show();
			return ;
			}
	
	}
