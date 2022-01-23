import java.util.*;
public class variable {
public static void main( String[] args){
       int x= 15;
        int y= 10;
        int sum = x+y;
        

        System.out.println("sum of " +x+" and "+y+" is equal to "+sum);
        System.out.println("product of "+ x+" * "+y+" is " +x*y);
         int div1 = x/y;
        int div2 = y/x;
        int div3 = x%y; 
         System.out.println("Divide of "+x +"and " +y +" is "+ div1 );
         System.out.println("Divide of "+y +"and " +x +" is "+ div2 );
         
         System.out.println("Modulos of "+x +"and " +y +" is "+ div3 );  
         System.out.println(x*y/x+y);

         System.out.println((x*y)/(x+y));

    }
}
