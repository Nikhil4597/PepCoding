import java.util.*;
public class MagicSquareGrid{
    public static int numMagicSquareInside(int [] [] grid)
    {
        int sr = 1; //starting row
        int er = grid.length-1;
        int sc = 1;
        int ec = grid[0].length-1;
        int count =0;
        for(int i = sr;i<er;i++)
        {
            for(int j = sc;j<ec;j++)
            {
                if(grid[i][j] ==5 && isMagicSquare(grid,i,j))
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isMagicSquare(int [][] grid,int i,int j)
    {
        int a = grid[i-1][j-1]+grid[i-1][j]+grid[i-1][j+1];
        int b = grid[i][j-1]+grid[i][j]+grid[i][j+1];
        int c = grid[i+1][j-1]+grid[i+1][j]+grid[i+1][j+1];
        if( a==15 && b==15 && c==15)
        {
            return true;
        }
        return false;
    }
    public static void main(String [] args)
    {
        int [][] arr ={{7,8,1,6},{2,3,5,7},{3,4,9,2},{1,6,4,5}};
        System.out.println(numMagicSquareInside(arr));
    }
}