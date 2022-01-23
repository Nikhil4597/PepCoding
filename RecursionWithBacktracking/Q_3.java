import java.util.*;

public class Q_3 {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] [] chess = new int [n][n];
    printNQueens(chess, "", 0);
}    
public static void printNQueens(int[][] chess, String qsf, int row) {
    if(row ==chess.length)
    {
        System.out.println(qsf+".");
        return;
    }
  
    for(int i =0;i<chess.length;i++)
{
    boolean pos = check(chess,row,i);
    if(pos == true){
    chess[row][i] = 1;
    printNQueens(chess, qsf+row+"-"+i+", ", row+1);
    chess[row][i] =0;
    }
}
}
public static boolean check(int [][]chess,int row,int col)
{ 
    for(int i = row-1;i>=0;i--)
    {
        if(chess[i][col]==1)
        {return false;}
    }
    for(int i= row-1,j=col+1;i>=0&&j<chess.length;i--,j++)
    {
         
        
            if(chess[i][j]==1)
            {return false;}
                 
    }
    for(int i=row-1,j =col-1;i>=0&&j>=0;i--,j--)
    {
       
       
            if(chess[i][j]==1)
            {return false;}
       
    }
    return true;
    }

    }
