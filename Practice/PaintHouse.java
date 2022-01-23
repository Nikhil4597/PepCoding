import java.util.*;
public class PaintHouse{
public static void main(String [] args)
{
Scanner scn = new Scanner(System.in);
int n= scn.nextInt();
int [][] paintcost = new int [n][3];
for(int i =0;i<n;i++)
{
for(int j =0;j<3;j++)
{
paintcost[i][j] =scn.nextInt();
}
}
System.out.println(minCost(paintcost));
}
    public static int minCost(int [] [] arr)
    {
    int or =arr[0][0];
    int og =arr[0][1];
    int ob =arr[0][2];
  
    
        for(int j =1;j<arr.length;j++)
        {
            int nr = Math.min(og,ob)+arr[j][0];
            int ng = Math.min(or,ob)+arr[j][1];
            int nb = Math.min(og,or)+arr[j][2];
         
            or =nr;
            og =ng;
            ob =nb;
        }
    
    return Math.min(or,Math.min(og,ob));
    }
}
