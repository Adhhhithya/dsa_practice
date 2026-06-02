public class triangle {
    public int minTriangleSum(int[][] triangle) {
        int n = triangle.length;
        int dp[][] = new int[n][n];
        for(int j=0;j<n;j++){
            dp[n-1][j] = triangle[n-1][j];
        }

        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int down = triangle[i][j] + dp[i+1][j];
                int downRight = triangle[i][j] + dp[i+1][j+1];
                dp[i][j] = Math.min(down,downRight);
            }
        }
        return dp[0][0];
    }
    //Tabulation
    // public int minTriangleSum(int[][] triangle) {
    //     int m = triangle.length;
    //     int dp[][] = new int[m][m];
    //     for(int[] row:dp){
    //         Arrays.fill(row,-1);
    //     }
    //     return func(0,0,m,triangle,dp);
    // }

    // private static int func(int i,int j,int m,int[][] mat,int[][]dp){
    //     if(i==m-1){
    //         return mat[m-1][j];
    //     }
        
    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }

    //     int down = mat[i][j] + func(i+1,j,m,mat,dp);
    //     int downRight = mat[i][j] + func(i+1,j+1,m,mat,dp);
    //     return dp[i][j] = Math.min(down,downRight);
    // }

    public static void main(String[] args) {
        triangle obj = new triangle();
        int matrix[][] = {{2},{3,4},{6,5,7},{4,1,8,3}};
        System.out.println(obj.minTriangleSum(matrix));
    }
}
