import java.util.*;
public class NextGreaterElement{
    public static int nextGreaterElement(int n)
    {
        int len = 0;
        int temp = n;
        while(temp>0)
        {
            temp/=10;
            len++;
        }
       char  [] nums = new char [len];
       int idx=len-1;
 
        while(n>0)
        {
            nums[idx] = (char)('0'+(n%10));
            n/=10;
            idx--;
        }   

         idx = len-1;
        
        while(idx>0 && nums[idx-1]>nums[idx])
        {
            idx--;
        }
        if(idx ==0)
        {
            return -1;
        }
         
         // change with  the min place value
        //  idx-1= first smaller
        int j = nextMax(nums,idx-1); // j=1
    
        swap(nums,idx-1,j);
         

    
        reverse(nums,idx);
     
       
        int ans  = 0;
       
        for(int i = 0;i<len;i++)
        {
            ans*=10;
            ans+=(nums[i]-'0');
            
        }
        return ans;
    }
    
    public static int nextMax(char [] str ,int j)
    {
        char jchar  = str[j];
       
        int idx =j;
        for(int i=str.length-1; i>=0;i--)
        {
             if(jchar<str[i])
             {
                 idx = i;
                 break;
             }
        }
         
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
