import java.util.*;
public class Medianof2Arr{
    public static double findMedianSortedArrays(int [] nums1,int [] nums2)
    {
        int n = nums1.length;
        int m = nums2.length;
        int [] total = new int [n+m];
        int i =0;int j =0;
        int k =0;
        while(i<n && j<m)
        {
            if(nums1[i]<=nums2[j])
            {
                total[k++] = nums1[i++];

            }
            else{
                total[k++] = nums2[j++];
            }
        }
        while(i<n)
        {
            total[k++] = nums1[i++];
        }
        while(j<m)
        {
            total[k++] = nums2[j++];
        }
        if((m+n)%2 != 0){
            String ans = String.format("%.5f",total[(m+n)/2]);
            System.out.println(ans);
            return 0.0;
        }
        else{
            int idx = (m+n-1)/2;
            String ans = String.format("%.5",(total[idx]+total[idx+1])/2);
            System.out.println(ans);
            return 0.0;
        }
    }
    public static void main(String [] args)
    {
        int  [] arr1 = {1,3};
        int [] arr2 ={2,4};
        System.out.println(findMedianSortedArrays(arr1,arr2));
          }
}