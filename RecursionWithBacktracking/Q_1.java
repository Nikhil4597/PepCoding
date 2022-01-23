import java.io.*;
import java.util.*;

public class Q_1{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean [][]vist = new boolean[n][m];
        floodfill(arr, 0, 0, "",vist);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf,boolean [][] vist) {
    if(sr<0||sr>=maze.length||sc<0||sc>=maze[0].length||maze[sr][sc]==1||vist[sr][sc]==true)
    {return ;}
    if(maze.length-1==sr&&maze[0].length-1==sc)
    {
		System.out.println(asf);
		return;
		}
    vist[sr][sc]=true;
     //top move
    floodfill(maze,sr,sc-1,asf+'t',vist);
    //left move
    floodfill(maze,sr-1,sc,asf+'l',vist);
    //down
    floodfill(maze,sr,sc+1,asf+'d',vist);
    //right move
    floodfill(maze,sr+1,sc,asf+'r',vist);
   vist[sr][sc] = false;
   
    }
}
