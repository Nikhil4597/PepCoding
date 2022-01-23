import java.util.*;
public class Goldmine {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m=  scn.nextInt();
        int [][]gm = new int [n][m];
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                gm[i][j] = scn.nextInt();

            }
        }
            System.out.println(findGold(gm,0,0));

    }
    public static int findGold(int [][]gm,int r,int c)
    {
      int ans = Integer.MIN_VALUE;
      for (int i =0;i<gm.length;i++ ) {
        ans = Math.max(ans,maxGold(gm,i,0));
      }
      return ans;
    }
    public static int maxGold(int [] [] gm,int r,int c)
    {
        if(r<0 || r==gm.length)
        {
            return Integer.MIN_VALUE;
        }
        if(c==gm[0].length-1)
        {
            return gm[r][c];
        }
       int d1 = maxGold(gm, r-1, c+1);
       int d2 = maxGold(gm, r, c+1);
       int d3 = maxGold(gm, r+1, c+1);
       int ans = Math.max(d1,Math.max(d2,d3))+gm[r][c];

       return  ans;
    }
}
