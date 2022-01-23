import java.util.*;
public class NormalStack{
	public static class  stack{
	int data[];
	int tos;
	
	public stack(int cap){
	data = new int [cap];
	tos =-1;
	}
	int top(){
		if(tos == -1)
		{
			System.out.println("Stack underflow");
			return -1;
			
			}
		return data[tos];
		}
	int size()
	{
		return tos+1;
		
		}
	void push(int val){
		
			if(tos == data.length-1)
			{
				System.out.println("Stack overflow");
				//dynamic
					//resize();
					//push(val);
					
			}
			else
			{
			tos++;
			data[tos] = val;
			}
	}
	void show()
	{
		for(int i =tos;i>=0;i--)
		{
			System.out.print(data[i]+" ");
			}
		System.out.println();
		
		}
	int pop()
	{
		if(tos ==-1)
		{
				System.out.println("Stack underflow");
				return -1;
		}
		else
		{
			int val = data[tos];
			data[tos]=0;
			tos--;
			return val;
		}
		//for Dynamic Stack 
		//void resize(){
			//int []newData = new int [2*data.length];
			//for(int i= 0;i<data.length;i++)
			//{
				//newData[i] = data[i];
				//}
			//}
			//data = newData;
	//}
	
	 
	
}
		public static void main(String [] args)
		{
			Scanner scn  = new Scanner(System.in);
			int n = scn.nextInt();
			stack stk = new stack(n);
			stk.push(10);
			stk.show();
			stk.push(20);
			stk.show()	;
			stk.pop();
			stk.top();
			stk.push(30);
			stk.push(40);
			stk.push(50);
		stk.show();
		
			
		}
}
