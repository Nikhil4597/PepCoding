import java.util.*;
public class RemovePrime{
	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList <Integer> list = new ArrayList<>();
		for(int i =0 ;i<n;i++)
		{
			list.add(scn.nextInt());
			}
			solution(list);
			System.out.println(list);
		}
		public static void solution(ArrayList <Integer> list)
		{
			for(int i =list.size()-1;i>=0;i--)
			{
				int temp = list.get(i);
				if(isPrime(temp)==true)
				{
					list.remove(i);
					}
					
				}
			}
			public static boolean isPrime(int num)
			{
				int last = (int)Math.sqrt(num);
				for(int i =2;i<=last;i++)
				{
					if(num%i==0)
					{
						return false;
						}
					}
					return true;
				}
	}
