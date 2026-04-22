import java.util.*;
public class climbing_stairs {
    public static int climbStairs(int n){
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int prev = 1;
        int prev2 = 1;
        return dp[n] = func(n,dp,prev,prev2);
    }

    private static int func(int n, int[] dp, int prev, int prev2){
        if(n<=1) return 1;
        for(int i=2;i<=n;i++){
            int curr = prev  + prev2;
            prev2= prev;
            prev = curr;
        }
        return prev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs: ");
        int n = sc.nextInt();
        System.out.println("The number of ways to climb "+n+" stairs is: "+climbStairs(n));
        sc.close();
    }
}
