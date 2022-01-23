import java.util.*;
public class Intro{
    public static class Student{
      int sn;
      String name;
      void show(){
        System.out.println(sn+" "+name);
      }
      void updateName(String newName){
        name   = newName;
      }
      Student()
      {
		this.sn =0;
		this.name = "None";
      }
      Student (int rn,String naam)
      {
        this.sn = rn;
        this.name = naam;
      }
    }

      public static void main(String [] args)
      {
        Student s1 = new Student(405,"Rohih");
        // s1.sn =1;
        // s1.name ="Rohit";

        Student s2 = new Student();
        s1.show();
        s2.show();
  }
}
