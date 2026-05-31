import java.util.*;
public class unique_paths {
    //Space Optimization
    public int uniquePaths(int m, int n) {
        int prev[] = new int[n];
        Arrays.fill(prev,0);
        for(int i=0;i<m;i++){
            int curr[] = new int[n];
            for(int j=0;j<n;j++){
                if(i==0 &&j==0){
                    curr[j]=1;
                    continue;
                }
                int up = (i>0) ? prev[j]:0;
                int left = (j>0) ? curr[j-1]:0;
                curr[j] = up+left;
            }
            prev = curr;
        }
        return prev[n-1];
    }
    //Tabulation
    // public int uniquePaths(int m, int n) {
    //     int dp[][] = new int[m][n];
    //     dp[0][0] = 1;

    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             if(i==0 && j==0){
    //                 dp[i][j]=1;
    //                 continue;
    //             }
    //             int up = (i>0)?dp[i-1][j]:0;
    //             int left = (j>0)?dp[i][j-1]:0;
    //             dp[i][j]= up+left;
    //         }
    //     }
    //     return dp[m-1][n-1];
    // }
    //Memoization
    // public int uniquePaths(int m, int n) {
    //     int dp[][] = new int[m][n];
    //     for(int[] row:dp){
    //         Arrays.fill(row,-1);
    //     }
    //     return func(m-1,n-1,dp);
    // }
    // private static int func(int i,int j,int[][] dp){
    //     if(i==0 && j==0) return 1;
    //     if(i<0 || j<0) return 0;
    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }
    //     int up = func(i-1,j,dp);
    //     int left = func(i,j-1,dp);
    //     return dp[i][j]=up+left;
    // }
    //Recursion
    // public int uniquePaths(int m, int n) {
    //     return func(m-1,n-1);
    // }
    // private static int func(int i,int j){
    //     if(i==0 && j==0) return 1;
    //     if(i<0 || j<0) return 0;
    //     int up = func(i-1,j);
    //     int left = func(i,j-1);
    //     return up+left;
    // }

    public static void main(String[] args) {
        unique_paths obj = new unique_paths();
        int m = 3;
        int n = 7;
        System.out.println(obj.uniquePaths(m, n));
    }
}
