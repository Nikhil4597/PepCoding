import java.io.*;
import java.util.*;

public class Q_4 {

    public static void main(String[] args) throws Exception {
 	Scanner scn = new Scanner(System.in);
 	int n =scn.nextInt();
 	int row = scn.nextInt();
 	int col = scn.nextInt();
 	
 	int [][]chess = new int[n][n];
 		
 	  printKnightsTour(chess,row,col,1);     
    }
static int [] [] steps = {{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};
    
     public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
          if(upcomingMove == chess.length*chess.length)
          {
          chess[r][c] =upcomingMove;
          displayBoard(chess);
          chess[r][c]=0;
          return;
         }
          chess[r][c]= upcomingMove;
        for(int i =0;i<8;i++)
        {
        int rns = r+steps[i][0]; //row next step
        int cns = c+steps[i][1];//col next Step
       	if(rns>=0 && rns < chess.length && cns>=0 && cns<chess.length && chess[rns][cns]==0)
       	{
       	printKnightsTour(chess,rns,cns,upcomingMove+1);
       	}
       	}
       chess[r][c] =0;
         }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
