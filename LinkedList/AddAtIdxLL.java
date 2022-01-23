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
			
			int size(){
				return size;
				}
				
			void push(int val){
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
				
				void show(){
				Node temp = new Node ();
				temp = head;
				while(temp!=null)
				{
					System.out.print(temp.data+" ");
					temp = temp.next;
					}
					System.out.println();
					} 
					
					void add(int idx,int val)
					{
							Node newNode = new Node();
							newNode.data = val; 
							if(idx == 0)
							{
								newNode.next = head;
								head = newNode;
								size++;
								}
							else if(idx  == size-1)
							{
								tail.next = newNode;
								tail = newNode;
								size++;
								
								}
								else if(idx>0 && idx<size)
								{ int i =0;
									Node temp = new Node();
									 temp = head;
									while(i<idx-1)
									{
										temp = temp.next;
										i++;
										}
										Node temp1 = temp.next;
										newNode.next = temp1;
										temp.next = newNode;
										size++;
									}
								else
								{
									System.out.println("Invalid arguments");
									}
									
						}
			}
			
			public static void main(String [] args)
			{
				Scanner scn = new Scanner(System.in);
				LL list  = new LL ();
				int val =scn.nextInt();
				while(val!=-1)
				{
					list.push(val);
					val = scn.nextInt();
					}
				list.show();
			System.out.println(list.size());

				int idx = scn.nextInt();
				int val1 = scn.nextInt();
				
			
				list.add(idx,val1);
				list.show();
				System.out.println(list.size());
				
				}
			
	}
