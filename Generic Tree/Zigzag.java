import java.util.*;
public class Zigzag {
    public static class Node{
        int data;
        ArrayList <Node> children ;
        Node(int data){
            this.data = data;
            children = new ArrayList <>();

        }
    }
    public static Node getTree(int [] arr)
    {
        Stack <Node> stk = new Stack <>();
        Node root = null;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==-1)
            {
                stk.pop();

            }
            else{
                Node newNode = new Node(arr[i]);
                if(root == null)
                {
                    root = newNode;
                }
                else{
                    Node parent = stk.peek();
                    parent.children.add(newNode); 
                     }
                stk.push(newNode);
            }
        }
        return  root;
    }
    
    public static void zigzag(Node node)
    {
      Stack <Node> ms = new Stack <> ();//main stack
      Stack <Node> cs= new Stack <>();

      ms.push(node);
      int lvl =0;
      while(ms.size()>0)
      {
        //Remove
        Node rm = ms.pop();
          //work
	System.out.print(rm.data+" ");
	if(lvl%2==0)
	{
	  for(int i =0;i<rm.children.size();i++)
	  {
	      Node child = rm.children.get(i);
	      cs.push(child);

	  }

	}
	else
	{
	    for(int i =rm.children.size()-1;i>=0;i--)
	    {
		    cs.push(rm.children.get(i));
	    }

	}
	if(ms.size()==0)
	{
	  //for(int i =0;i<cs.size())
	  {
		  System.out.println();
		    ms = cs;

		  cs = new Stack <>();
		  lvl++;

	  }
	}


      }
    }
        public static void main(String [] args)
        {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int [] arr  = new int [n];
            for(int i =0;i<n;i++)
            {
                arr[i] = scn.nextInt();
                }
            Node root = getTree(arr);
            zigzag(root);
        }
    
}
