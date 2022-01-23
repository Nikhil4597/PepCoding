import java.util.*;
public class MergeLLs{
	public static class Node {
		int data;
		Node next;
		}
		
	public static class LL{
		Node head;
		Node tail;
		int size;
		int size()
		{
			return size;
			}
		void show()
		{
			Node  temp = head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
				}
				System.out.println();
			}
			void push(int val){
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
				
}		
	public static LL mergeTwoLL(LL l1,LL l2)
			{	 
				LL merge = new LL ();
				Node temp1= l1.head;
				Node temp2  = l2.head;
			
				
				while(temp1!=null && temp2!=null)
				{
					if(temp1.data<temp2.data)
					{
						merge.push(temp1.data);
						temp1= temp1.next;
						
						}
						else
						{
							merge.push(temp2.data);
							temp2 = temp2.next;
							}
					
				}
				while(temp1!= null)
				{
					merge.push(temp1.data);
					temp1 = temp1.next;
					}
					
				while(temp2!= null)
				{
					merge.push(temp2.data);
					temp2 = temp2.next;
					}
				 return merge;
			}
		
				public static void main(String [] args)
				{
					Scanner scn = new Scanner(System.in);
					LL l1 = new LL ();
					LL l2 = new LL ();
					int val1 = scn.nextInt();
					while(val1 != -1)
					{
						l1.push(val1);
						val1 = scn.nextInt();
					
					}
					System.out.println(l1.size());
					l1.show();
					int  val2 = scn.nextInt();
					while(val2!= -1)
					{
					 l2.push(val2);
					 val2 = scn.nextInt();
					}
						System.out.println(l2.size());
						l2.show(); 
						
						LL mergelist = mergeTwoLL(l1,l2);
						 
						System.out.println(mergelist.size());
						mergelist.show();
						return ;
					}
		
	}
