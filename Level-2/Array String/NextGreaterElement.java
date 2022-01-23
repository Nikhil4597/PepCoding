import java.util.*;
public class NextGreaterElement{
    public static int nextGreaterElement(int n)
    {
        int count =0;int temp = n;
        while(temp>0)
        {
            count++;
            temp/=10;
        }

       char [] str = new char [count];
       for(int i=str.length-1;i>=0;i--)
       {
           int val =  n%10;
           str[i] = (char)('0'+val);
           n/=10; 
       }
         
        int j = count-2;

        while(j>0 && str[j]>str[j+1])
        {
            j--;
            
        }
        if(j==0)
        {
            return -1;
        }
        System.out.println("j "+j);
        int   sidx= nextMax(str,j); //swaping idx
        System.out.println("sidx "+sidx);
        swap(str,sidx,j);
        reverse(str,j+1);
        
         
        // swap(str,1,5);
        for(char i: str)
        {
            System.out.println("After"+" "+i);
        }
        return 0;
        
    }
    public static int nextMax(char [] str ,int j)
    {
        char jchar  = str[j];
        System.out.println("jchar "+jchar);
        int idx =j;
        for(int  i =j+1;i<str.length;i++)
        {
            if(Character.compare(str[j],str[i])>0)
            {
                if(Character.compare(str[i],jchar)>0)
                {
                    jchar = str[i];
                    idx = i;
                            System.out.println("i "+i);

                }
            }
        }
        System.out.println("idx "+idx);
        return idx; 
    }
    public static void swap(char [] str ,int i ,int j)
    {
        char ichar = str[i];
         str[i] = str[j];
        str[j] = ichar;
    }
    public static void reverse(char [] str ,int j)
    {
        int len = str.length-1;

        while(j<len)
        {
            swap(str,j,len);
            j++;
            len--;
        }
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(nextGreaterElement(n));
    }
}