import java.util.*;
public class School{

	public static class student{
		int rollno ;
		String name ;

		 void showData()
		{
			System.out.println(rollno+" "+name);
		}
		void changeName(String nname)
		{
			name = nname;

		}

	}
	public static void main(String [] args)
	{
		student s1 = new student();
		student s2 = new student();
		s1.name ="Rohit Mihsra";
		s1.rollno = 128765;

		s2.name ="vishnu Mihsra";
		s2.rollno = 128745;
		s1.showData();
		s2.changeName("Anjali");
		s2.showData();
	}

}
