import java.util.*;
public class LargestAreaHisto {

    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println(largestRectangleArea(arr));
    }
        public static int largestRectangleArea(int[] heights) {
          Stack<Integer> st = new Stack<>();
        int max =0;
        
        st.push(-1);
        
        for(int i=0;i<=heights.length;i++){
            int val = i==heights.length? 0:heights[i];
            
            while(st.peek() >=0 && heights[st.peek()] >= val){
                int h = heights[st.pop()];
                int start = st.peek();
                max = Math.max(max, h*(i-start-1));
            }
            st.push(i);
        }
        
        return max;
	}
}
