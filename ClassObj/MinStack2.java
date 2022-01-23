import java.io.*;
import java.util.*;

public class MinStack2 {

  public static class MinStack {
    Stack<Integer> data;
    int min;

    public MinStack() {
      data = new Stack<>();
    }

    int size() {
      return data.size();
    }

    void push(int val) {
      if(data.size()==0)
      {
        data.push(val);
        min= val;
        return;

      }
      if(min>val)
      {
        int value = val+(val-min);
        data.push(value);
          min = val;
      }
      else
      {
        data.push(val);
      }
    }

    int pop() {
    if(data.size()==0)
    {
      System.out.println("Stack underflow");
      return -1;
    }
    else if(min>data.peek())
    {
      int real = min;
      int value =data.pop();
      int omin = (min*2)-value;

      min = omin;
      return real;
    }
    else{
      return data.pop();
    }
  }

    int top() {
      if(data.peek()<min)
      {
          return min;
      }
      else{
      return data.peek();
    }
  }

    int min() {
      if(data.size()==0)
      {
        System.out.println("Stack underflow");
        return -1;
      }
      return min;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MinStack st = new MinStack();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if (str.startsWith("pop")) {
        int val = st.pop();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top")) {
        int val = st.top();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(st.size());
      } else if (str.startsWith("min")) {
        int val = st.min();
        if (val != -1) {
          System.out.println(val);
        }
      }
      str = br.readLine();
    }
  }
}
