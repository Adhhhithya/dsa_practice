public class zero_one_knapsack {
    //1D Space Optimization
        public static int knapsack(int wt[],int val[],int W){
        int n = wt.length;
        int prev[] = new int[W+1];
        
        for(int i=wt[0];i<=W;i++){
            prev[i] = val[0];
        }

        for(int ind=1;ind<n;ind++){
            for(int w =W;w>=0;w--){
                int not_take = prev[w];
                int take = Integer.MIN_VALUE;
                if(wt[ind]<=w){
                    take = val[ind] + prev[w-wt[ind]];
                }
                prev[w] = Math.max(take,not_take);
            }
        }
        return prev[W];
    }
    //Spcae Optimization
    // public static int knapsack(int wt[],int val[],int W){
    //     int n = wt.length;
    //     int prev[] = new int[W+1];
        
    //     for(int i=wt[0];i<=W;i++){
    //         prev[i] = val[0];
    //     }

    //     for(int ind=1;ind<n;ind++){
    //         int curr[] = new int[W+1];
    //         for(int w =0;w<=W;w++){
    //             int not_take = prev[w];
    //             int take = Integer.MIN_VALUE;
    //             if(wt[ind]<=w){
    //                 take = val[ind] + prev[w-wt[ind]];
    //             }
    //             curr[w] = Math.max(take,not_take);
    //         }
    //         prev = curr;
    //     }
    //     return prev[W];
    // }
    //Tabulation
    // public static int knapsack(int wt[],int val[],int W){
    //     int n = wt.length;
    //     int dp[][] = new int[n][W+1];
        
    //     for(int i=wt[0];i<=W;i++){
    //         dp[0][i] = val[0];
    //     }

    //     for(int ind=1;ind<n;ind++){
    //         for(int w =0;w<=W;w++){
    //             int not_take = dp[ind-1][w];
    //             int take = Integer.MIN_VALUE;
    //             if(wt[ind]<=w){
    //                 take = val[ind] + dp[ind-1][w-wt[ind]];
    //             }
    //             dp[ind][w] = Math.max(take,not_take);
    //         }
    //     }
    //     return dp[n-1][W];
    // }
    //Memoization
    // public static int knapsack(int wt[],int val[],int W){
    //     int n = wt.length;
    //     int dp[][] = new int[n][W+1];
    //     for(int row[]:dp) Arrays.fill(row,-1);
    //     return func(n-1,W,wt,val,dp);
    // }
    // private static int func(int ind,int W,int wt[],int val[],int dp[][]){
    //     if(ind==0){
    //         if(ind<0 || W==0) return 0;
    //         if(wt[0]<=W) return val[0];
    //         else return 0;
    //     }

    //     if(dp[ind][W]!=-1) return dp[ind][W];
    //     int not_take = func(ind-1,W,wt,val,dp);
    //     int take = Integer.MIN_VALUE;
    //     if(wt[ind]<=W){
    //         take = val[ind] + func(ind-1,W-wt[ind],wt,val,dp);
    //     }
    //     return dp[ind][W]=Math.max(take,not_take);
    // }
    //Recursion
    // public static int knapsack(int wt[],int val[],int W){
    //     int n = wt.length;
    //     return func(n-1,W,wt,val);
    // }
    // private static int func(int ind,int W,int wt[],int val[]){
    //     if(ind==0){
    //         if(ind<0 || W==0) return 0;
    //         if(wt[0]<=W) return val[0];
    //         else return 0;
    //     }

    //     int not_take = func(ind-1,W,wt,val);
    //     int take = Integer.MIN_VALUE;
    //     if(wt[ind]<=W){
    //         take = val[ind] + func(ind-1,W-wt[ind],wt,val);
    //     }
    //     return Math.max(take,not_take);
    // }

    public static void main(String[] args){
        int wt[] = {3,4,5};
        int val[] = {30,50,60};
        int W = 8;
        int ans = knapsack(wt,val,W);
        System.out.println(ans);
    }
}
