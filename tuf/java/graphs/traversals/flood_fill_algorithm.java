import java.util.*;
public class flood_fill_algorithm{
    public static int[][] flood_fill(int sr,int sc,int newColor,int[][]image){
        int n = image.length;
        int m =  image[0].length;
        int initColor = image[sr][sc];
        int [] delta_row = {-1,0,1,0};
        int [] delta_col = {0,1,0,-1};
        int [][] ans = image;
        dfs(sr,sc,initColor,newColor,image,ans,delta_row,delta_col);
        return ans;
    }

    private static void dfs(int row,int col,int initColor ,int newColor ,
        int[][] image, int[][] ans,int[] delta_row,int[] delta_col){
            ans[row][col] = newColor;
            int n = image.length;
            int m = image[0].length;

            for(int i=0;i<4;i++){
                int nrow = row + delta_row[i];
                int ncol = col + delta_col[i];

                if(nrow>=0 && nrow<n &&
                    ncol>=0 && ncol<m &&
                    image[nrow][ncol]==initColor &&
                    ans[nrow][ncol]!=newColor){
                        dfs(nrow,ncol,initColor,newColor,image,ans,delta_row,delta_col);
                    }
            }
        }
    public static void main(String[] args){
        int[][] image = {{1,1,1},
                         {1,1,0},
                         {1,0,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int[][] ans = flood_fill(sr,sc,newColor,image);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }    
}