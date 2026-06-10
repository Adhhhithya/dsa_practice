public class count_subsets_with_sum_k {
    //Space Optimization
    public static int count_subset_sum(int arr[],int K){
        int n = arr.length;
        int prev[] = new int [K+1];
        prev[0] =0;
        if(arr[0]<=K){
            prev[arr[0]] =1;
        }

        for(int ind=1;ind<n;ind++){
            int curr[] = new int[K+1];
            curr[0] = 1;
            for(int sum=1;sum<=K;sum++){
                int not_take = prev[sum];
                int take =0;
                if(arr[ind]<=sum){
                    take = prev[sum-arr[ind]];
                }
                curr[sum] = take + not_take;
            }
            prev=curr;
        }
        return prev[K];
    }
    //Tabulation
    // public static int count_subset_sum(int arr[],int K){
    //     int n = arr.length;
    //     int dp[][] = new int[n][K+1];
    //     for(int i=0;i<n;i++){
    //         dp[i][0]=1;
    //     }
    //     if(arr[0]<=K){
    //         dp[0][arr[0]] =1;
    //     }

    //     for(int ind=1;ind<n;ind++){
    //         for(int sum=1;sum<=K;sum++){
    //             int not_take = dp[ind-1][sum];
    //             int take =0;
    //             if(arr[ind]<=sum){
    //                 take = dp[ind-1][sum-arr[ind]];
    //             }
    //             dp[ind][sum] = take + not_take;
    //         }
    //     }
    //     return dp[n-1][K];
    // }
    //Memoization
    // public static int count_subset_sum(int arr[],int K){
    //     int n = arr.length;
    //     int dp[][] = new int[n][K+1];
    //     for(int row[]:dp){
    //         Arrays.fill(row,-1);
    //     }
    //     return func(n-1,K,arr,dp);
    // }
    // private static int func(int ind,int sum, int arr[], int dp[][]){
    //     if(sum==0) return 1;
    //     if(ind==0) return arr[0]==sum?1:0;
    //     if(dp[ind][sum]!=-1) return dp[ind][sum];
    //     int not_take = func(ind-1,sum,arr,dp);
    //     int take =0;
    //     if(arr[ind]<=sum){
    //         take = func(ind-1,sum-arr[ind],arr,dp);
    //     }
    //     return dp[ind][sum] = take + not_take;
    // }

    //Recursion
    // public static int count_subset_sum(int arr[],int K){
    //     int n = arr.length;
    //     return func(n-1,K,arr);
    // }
    // private static int func(int ind,int sum, int arr[]){
    //     if(sum==0) return 1;
    //     if(ind==0) return arr[0]==sum?1:0;
    //     int not_take = func(ind-1,sum,arr);
    //     int take =0;
    //     if(arr[ind]<=sum){
    //         take = func(ind-1,sum-arr[ind],arr);
    //     }
    //     return take + not_take;
    // }
    public static void main(String[] args){
        int arr[] = {1,2,2,3};
        int K = 3;
        int ans = count_subset_sum(arr,K);
        System.out.println(ans);
    }
}
