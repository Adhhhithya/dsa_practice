public class min_falling_path_sum {
    //Tabulation
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m][n];
        
        for(int j=0;j<n;j++){
            dp[0][j] = matrix[0][j];
        }

        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int up = matrix[i][j] + dp[i-1][j];
                int upLeft = matrix[i][j];
                if(j-1>=0){
                    upLeft += dp[i-1][j-1];
                }else{
                    upLeft = Integer.MAX_VALUE;
                }
                int upRight = matrix[i][j];
                if(j+1<n){
                    upRight += dp[i-1][j+1];
                }else{
                    upRight = Integer.MAX_VALUE;
                }
                dp[i][j] = Math.min(up,Math.min(upLeft,upRight));
            }
        }
        int mini = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            mini = Math.min(mini,dp[m-1][j]);
        }
        return mini;
    }
    //Memoization
    // public int minFallingPathSum(int[][] matrix) {
    //     int m = matrix.length;
    //     int n = matrix[0].length;
    //     int dp[][] = new int[m][n];
    //     for(int []row:dp){
    //         Arrays.fill(row,-1);
    //     }
    //     int mini = Integer.MAX_VALUE;
    //     for(int j=0;j<n;j++){
    //         mini = Math.min(mini,func(m-1,j,m,n,matrix,dp));
    //     }
    //     return mini;
    // }
    // private static int func(int i,int j,int m,int n,int[][] matrix,int [][]dp){
    //     if(j<0 || j>=n){
    //         return (int) 1e9;
    //     }

    //     if(i==0){
    //         return matrix[0][j];
    //     }
        
    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }

    //     int up = matrix[i][j] + func(i-1,j,m,n,matrix,dp);
    //     int upLeft = matrix[i][j] + func(i-1,j-1,m,n,matrix,dp);
    //     int upRight = matrix[i][j] + func(i-1,j+1,m,n,matrix,dp);
    //     return dp[i][j] = Math.min(up,Math.min(upLeft,upRight));
    // }
    public static void main(String[] args) {
        min_falling_path_sum obj = new min_falling_path_sum();
        int matrix[][] = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(obj.minFallingPathSum(matrix));
    }
}
