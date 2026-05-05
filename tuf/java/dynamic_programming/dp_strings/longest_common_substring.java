import java.util.*;
public class longest_common_substring {
    public static int lcs(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];
        int ans = 0;
        for(int j=0;j<m;j++) dp[0][j]=0;
        for(int i=0;i<n;i++) dp[i][0]=0;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    ans = Math.max(ans,dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String s1 = sc.nextLine();
        System.out.print("Enter the second string:");
        String s2 = sc.nextLine();
        System.out.println("The Length of Longest Common Substring is "+lcs(s1,s2));
        sc.close();
    }
}
