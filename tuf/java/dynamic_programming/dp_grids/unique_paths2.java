import java.util.*;
public class unique_paths2 {
    //Space Optimization
    public int uniquePathsWithObstacles(int[][] matrix) {
        int m =matrix.length;
        int n = matrix[0].length;
        int prev[] = new int[n];
        Arrays.fill(prev,0);
        for(int i=0;i<m;i++){
            int curr[] = new int[n];
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                    curr[j]=0;
                    continue;
                }
                if(i==0 && j==0){
                    curr[j]=1;
                    continue;
                }
                int up = (i>0) ? prev[j]:0;
                int left = (j>0) ? curr[j-1]:0;
                curr[j] = up + left;
            }
            prev = curr;
        }
        return prev[n-1];
    }
    //Tabulation
    // public int uniquePathsWithObstacles(int[][] matrix) {
    //     int m =matrix.length;
    //     int n = matrix[0].length;
    //     int dp[][] = new int[m][n];
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             if(matrix[i][j]==1){
    //                 dp[i][j]=0;
    //                 continue;
    //             }
    //             if(i==0 && j==0){
    //                 dp[i][j]=1;
    //                 continue;
    //             } 
    //             int left = (j>0) ? dp[i][j-1]:0;
    //             int up = (i>0) ? dp[i-1][j]:0;
    //             dp[i][j] = left + up;
    //         }
    //     }
    //     return dp[m-1][n-1];
    // }
    //Memoization
    // public int uniquePathsWithObstacles(int[][] matrix) {
    //     int m =matrix.length;
    //     int n = matrix[0].length;
    //     int dp[][] = new int[m][n];
    //     for(int[]row:dp){
    //         Arrays.fill(row,-1);
    //     }
    //     return func(m-1,n-1,matrix,dp);
    // }
    // private static int func(int i,int j,int[][] mat,int[][]dp){
    //     if(i>=0 && j>=0 && mat[i][j]==1) return 0;
    //     if(i==0 &&j==0) return 1;
    //     if(i<0 ||j<0) return 0;
    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }
    //     int left = func(i,j-1,mat,dp);
    //     int up = func(i-1,j,mat,dp);
    //     return dp[i][j] = left + up;
    // }

    public static void main(String[] args) {
        unique_paths2 obj = new unique_paths2();
        int matrix[][] = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(obj.uniquePathsWithObstacles(matrix));
    }
}