import java.util.*;
public class ContainMaxArea{
    public   static int maxArea(int [] height)
    {
        int i =0;int j = height.length-1;
        int max = 0;
        while(i<j)
        {
            int ht = Math.min(height[i],height[j]);
            int area = (j-1)*ht;
            max = area>max?area:max;
            if(ht == height[i])
            {
                i++;
            }
            else{
                j--
            }
        }
        return max;
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<n;i++)
        {
            arr[i] = scn.nextInt();
             
        } 
        System.out.println(maxArea(arr));
    }
}