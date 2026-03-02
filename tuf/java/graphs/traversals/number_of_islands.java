import java.util.*;
class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
public class number_of_islands {
    private static void bfs(int ro,int co,int[][]vis,char[][]grid){
        Queue<Pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        vis[ro][co] = 1;
        q.add(new Pair(ro,co));

        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();

            for(int delta_row=-1;delta_row<=1;delta_row++){
                for(int delta_col=-1;delta_col<=1;delta_col++){
                    int n_row = row + delta_row;
                    int n_col = col + delta_col;

                    if(n_row>=0 && n_row<n &&
                        n_col>=0 && n_col<m &&
                        vis[n_row][n_col]==0 &&
                        grid[n_row][n_col]=='1'){
                            vis[n_row][n_col]=1;
                            q.add(new Pair(n_row,n_col));
                        }
                }
            }
        }
    }
    public int num_islands(char[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    cnt++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        char[][] grid = {{'1','1','1','0','1'},
                         {'1','0','0','0','1'},
                         {'0','0','0','0','0'},
                         {'1','1','0','1','1'}};
        number_of_islands obj = new number_of_islands();
        int ans = obj.num_islands(grid);
        System.out.println("Number of Islands: "+ans);
    }
}
