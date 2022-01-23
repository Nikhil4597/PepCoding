import java.util.*;
public class countBinaryString{
public static void main(String [] args){
 Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
	System.out.println(countBinary(n));
}
public static int countBinary(int n)
{
  int [] ans = countHelper(n);
  int sum =0;
  for(int i =0;i<ans.length;i++)
  {
    sum+=ans[i];
  } 
  return sum;
}
// public static int countHelper(int n ,int bit)
// {
//   if(n==1)
//   {
//     return 1;
//   }
//   int ans =0;
//   if(bit ==0)
//   {
//     ans =countHelper(n-1,1);
//   }
//   else
//   {
//     int ans1 =countHelper(n-1,0);
//     int ans2 =countHelper(n-1,1);
//     ans = ans1+ans2;
//   }
//   return ans;
//}
// Array Approach
public static int [] countHelper(int n)
{
  if(n==1)
  {
    int [] small_ans = {1,1};
    return small_ans;
  }
  int [] ans1 = countHelper(n-1);
  int [] ans2 = {ans1[1],ans1[0]+ans1[1]};
  return ans2;
} 
}
