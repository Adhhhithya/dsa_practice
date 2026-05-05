import java.util.*;
public class longest_common_subsequence {
    //tabulation (bottom-up)
    public static int lcs(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];
        for(int j=0;j<=m;j++){
            dp[0][j] = 0;
        }
        for(int i=0;i<=n;i++){
            dp[i][0] = 0;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    //memoization (top-down)
    // public static int lcs(String s1,String s2){
    //     int n = s1.length();
    //     int m = s2.length();
    //     int dp[][] = new int[n][m];
    //     for(int[] row: dp){
    //         Arrays.fill(row,-1);
    //     }
    //     return func(n-1,m-1,s1,s2,dp);
    // }
    // private static int func(int i,int j,String s1,String s2,int dp[][]){
    //     if(i<0 || j<0) return 0;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     if(s1.charAt(i)==s2.charAt(j)){
    //         return dp[i][j] = 1 + func(i-1,j-1,s1,s2,dp);
    //     }
    //     else{
    //         return dp[i][j] = Math.max(func(i-1,j,s1,s2,dp),func(i,j-1,s1,s2,dp));
    //     }
    // }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String s1 = sc.nextLine();
        System.out.print("Enter the second string:");
        String s2 = sc.nextLine();
        System.out.println("The Length of Longest Common Subsequence is "+lcs(s1,s2));
        sc.close();
    }
}
