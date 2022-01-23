import java.io.*;
import java.util.*;

public class NQueen {

    public static void main(String[] args) throws Exception {
   	Scanner scn =new Scanner(System.in);      
   	int n = scn.nextInt();
   	int [][]chess =new int [n][n];
   	printNQueens(chess ,"",0,0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row,int col) {
       
       if(row<0||row>=chess.length||col<0||col>=chess[0].length||chess[row][col]==1)
 	{
       return ;
       }
     
     
       chess[row][col]=1;
        //Down
        printNQueens(chess,qsf+(row+1)+"-"+col+",",row+1,col);
        //Up
        printNQueens(chess,qsf+(row-1)+"-"+col+","+col,row-1,col);
        //right
        printNQueens(chess,qsf+(row)+"-"+(col+1)+",",row,col+1);
        //left
        printNQueens(chess,qsf+(row)+"-"+(col-1)+",",row,col-1);
        //diagonal right down
        printNQueens(chess,qsf+(row)+"-"+(col+1)+",",row+1,col+1);
        //diagonal left up
        printNQueens(chess,qsf+(row-1)+"-"+(col-1)+",",row-1,col-1);
       //diagonal left down
        printNQueens(chess,qsf+(row+1)+"-"+(col-1)+",",row+1,col-1);
        //diagonal right up
        printNQueens(chess,qsf+(row-1)+"-"+(col+1)+",",row-1,col+1);
 	//chess[row][col] =0;       
 	       System.out.println(qsf+".");
 	       chess[row][col] =0;
    }
}
