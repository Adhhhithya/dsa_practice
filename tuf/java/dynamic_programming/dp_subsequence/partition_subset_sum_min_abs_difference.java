public class partition_subset_sum_min_abs_difference {
    public static int min_subset_sum_difference(int arr[]){
        int n = arr.length;
        int total_sum=0;
        for(int i=0;i<n;i++){
            total_sum += arr[i];
        }
        boolean dp[][] = new boolean[n][total_sum+1];
        for(int i=0;i<n;i++){
            dp[i][0] =true;
        }
        if(arr[0]<=total_sum){
            dp[0][arr[0]] = true;
        }
        for(int ind=1;ind<n;ind++){
            for(int target=1;target<=total_sum;target++){
                boolean not_take = dp[ind-1][target];
                boolean take = false;
                if(arr[ind]<=target){
                    take = dp[ind-1][target-arr[ind]];
                }
                dp[ind][target] = take || not_take;
            }
        }
            int mini = Integer.MAX_VALUE;
            for(int i=0;i<total_sum/2;i++){
                if(dp[n-1][i]==true){
                    int sum1 = i;
                    int sum2 = total_sum - i;
                    mini = Math.min(mini,Math.abs(sum1-sum2));
                }
            }
            return mini;
        }
        public static void main(String[] args){
            int arr[] = {3,2,7};
            int ans = min_subset_sum_difference(arr);
            System.out.println(ans);
    }
}
