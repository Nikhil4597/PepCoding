import java.util.*;
public class Main{
	public static class Node {
		int data;
		Node next;
		}
	public static class LinkedList{
		Node head;
		Node tail;
		int size;
		
		int size(){
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
				tail.next = newNode;
				tail = newNode;
			}
			size++;
			
		}
		
		void show(){
			Node temp = head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
				
			}
				System.out.println();
				
			}
		
		void addFirst(int val){
				Node newNode  = new Node();
				newNode.data = val;
				newNode.next = head;
				head = newNode ;
				size++;
				}
}
public static LinkedList addLists(LinkedList L1,LinkedList L2)
{
	LinkedList  sum  = new LinkedList();
	int c =helpToAdd(L1.head,L1.size()-1,L2.head,L2.size()-1,sum);
	if(c==1)
	{
		sum.addFirst(c);
		}
		return sum;
	}
	public static  int helpToAdd( Node p1,int s1,Node p2,int s2,LinkedList sum)
	{
		if(p1 ==null && p2 ==null)
		{
			return 0;
			
			}
		int add =0;
		if(s1>s2)//place val 1> place val 2
		{
			int c = helpToAdd(p1.next,s1-1,p2,s2,sum);
			add = c+p1.data;
			}
			else if(s1<s2)
			{
				int c =helpToAdd(p1,s1,p2.next,s2-1,sum);
				 add = c+p2.data;
				}
			else
			{
				int c =helpToAdd(p1.next,s1-1,p2.next,s2-1,sum);
				add = p1.data+p2.data+c;
				}
				int rem = add%10;
			int quo  = add/10;
			sum.addFirst(rem);
			return  quo;
}

			public static void main(String [] args)
			{
				Scanner scn = new Scanner(System.in);
				LinkedList l1 = new LinkedList();
				LinkedList l2 = new LinkedList();
				
				int val = scn.nextInt();
				while(val!=-1)
				{
					l1.push(val);
					val = scn.nextInt();
					}
					val = scn.nextInt();
				
				while(val!=-1)
				{
					l2.push(val);
					val = scn.nextInt();
					}
				 LinkedList sum  = addLists(l1,l2);
				 sum.show();
				 System.out.println(sum.size());
	}
}
