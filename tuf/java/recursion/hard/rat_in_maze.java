import java.util.*;
public class rat_in_maze {
    public List<String> findPath(int[][] grid) {
        //your code goes here
        List<String> ans = new ArrayList<>();
        String path = "";
        int n = grid.length;
        int m = grid[0].length;
        if(grid[0][0]==0 || grid[n-1][m-1]==0){
            return ans;
        }
        helper(0,0,path,grid,n,m,ans);
        return ans;
    }

    private static void helper(int i,int j, String path, int[][] grid,int n, int m,List<String> ans){
        if(i==n-1 && j==m-1){
            ans.add(path);
            return;
        }
        int temp = grid[i][j];
        grid[i][j] = 0;
        //down
        if(i+1 < n && grid[i+1][j]==1){
            helper(i+1,j,path+'D',grid,n,m,ans);
        }
        //left
        if(j-1>=0 && grid[i][j-1]==1){
            helper(i,j-1,path+'L',grid,n,m,ans);
        }
        //right
        if(j+1 < m && grid[i][j+1]==1){
            helper(i,j+1,path+'R',grid,n,m,ans);
        }
        //up
        if(i-1>=0 && grid[i-1][j]==1){
            helper(i-1,j,path+'U',grid,n,m,ans);
        }
        grid[i][j]=temp;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the grid:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        System.out.println("Enter the grid:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j] = sc.nextInt();
            }
        }
        rat_in_maze obj = new rat_in_maze();
        List<String> paths = obj.findPath(grid);
        System.out.println("Paths from source to destination:");
        for(String path : paths){
            System.out.println(path);
        }
        sc.close();
    }
}
