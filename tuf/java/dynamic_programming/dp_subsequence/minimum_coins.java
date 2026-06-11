public class minimum_coins {
    //1D Space Optimization
     public static int min_coins(int[] coins, int amount) {
        int n = coins.length;
        int prev[] = new int [amount+1];
        for(int i=0;i<=amount;i++){
            if(i% coins[0]==0) prev[i] = i/coins[0];
            else prev[i] = (int) 1e9;
        }
        for(int ind=1;ind<n;ind++){
            for(int t = 0;t<=amount;t++){
                int not_pick = prev[t];
                int pick = (int) 1e9;
                if(coins[ind]<=t){
                    pick = 1 + prev[t-coins[ind]];
                }
                prev[t]=Math.min(not_pick,pick);
            }
        }
        int ans = prev[amount];
        if(ans >= (int)1e9){
            return -1;
        }
        return ans;
     }
    //Space Optimization
    // public static int min_coins(int[] coins, int amount) {
    //     int n = coins.length;
    //     int prev[] = new int [amount+1];
    //     for(int i=0;i<=amount;i++){
    //         if(i% coins[0]==0) prev[i] = i/coins[0];
    //         else prev[i] = (int) 1e9;
    //     }
    //     for(int ind=1;ind<n;ind++){
    //         int curr[] = new int [amount+1];
    //         for(int t = 0;t<=amount;t++){
    //             int not_pick = prev[t];
    //             int pick = (int) 1e9;
    //             if(coins[ind]<=t){
    //                 pick = 1 + curr[t-coins[ind]];
    //             }
    //             curr[t]=Math.min(not_pick,pick);
    //         }
    //         prev=curr;
    //     }
    //     int ans = prev[amount];
    //     if(ans >= (int)1e9){
    //         return -1;
    //     }
    //     return ans;
    // }
    //Tabulation
    // public static int min_coins(int[] coins, int amount) {
    //     int n = coins.length;
    //     int dp[][] = new int[n][amount+1];
    //     for(int i=0;i<=amount;i++){
    //         if(i% coins[0]==0) dp[0][i] = i/coins[0];
    //         else dp[0][i] = (int) 1e9;
    //     }
    //     for(int ind=1;ind<n;ind++){
    //         for(int t = 0;t<=amount;t++){
    //             int not_pick = dp[ind-1][t];
    //             int pick = (int) 1e9;
    //             if(coins[ind]<=t){
    //                 pick = 1 + dp[ind][t-coins[ind]];
    //             }
    //             dp[ind][t]=Math.min(not_pick,pick);
    //         }
    //     }
    //     int ans = dp[n-1][amount];
    //     if(ans >= (int)1e9){
    //         return -1;
    //     }
    //     return ans;
    // }
    //Memoization
    //  public static int min_coins(int[] coins, int amount) {
    //     int n = coins.length;
    //     int dp[][] = new int[n][amount+1];
    //     for(int row[]:dp) Arrays.fill(row,-1);
    //     int ans = func(n-1,amount,coins,dp);
    //     if(ans >= (int)1e9){
    //         return -1;
    //     }
    //     return ans;
    // }
    // private static int func(int ind,int target,int arr[],int dp[][]){
    //     if(ind==0){
    //         if(target%arr[ind]==0) return target/arr[ind];
    //         else return (int) 1e9;
    //     }
    //     if(dp[ind][target]!=-1) return dp[ind][target];
    //     int not_pick = func(ind-1,target,arr,dp);
    //     int pick = (int) 1e9;
    //     if(arr[ind]<=target){
    //         pick = 1 + func(ind,target-arr[ind],arr,dp);
    //     }
    //     return dp[ind][target]=Math.min(not_pick,pick);
    // }
    //Recursion
    // public static int min_coins(int coins[],int amount){
    //     int n = coins.length;
    //     int ans = func(n-1,amount,coins);
    //     if(ans >= (int)1e9){
    //         return -1;
    //     }
    //     return ans;
    // }
    // private static int func(int ind,int target,int arr[]){
    //     if(ind==0){
    //         if(target%arr[ind]==0) return target/arr[ind];
    //         else return (int) 1e9;
    //     }
    //     int not_pick = func(ind-1,target,arr);
    //     int pick = (int) 1e9;
    //     if(arr[ind]<=target){
    //         pick = 1 + func(ind,target-arr[ind],arr);
    //     }
    //     return Math.min(not_pick,pick);
    // }

    public static void main(String[] args){
        int coins[] = {1,2,5};
        int amount = 11;
        int ans = min_coins(coins,amount);
        System.out.println(ans);
    }
}
