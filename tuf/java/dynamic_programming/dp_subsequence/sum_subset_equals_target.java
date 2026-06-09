public class sum_subset_equals_target {
    //Tabulation
    public static boolean is_subset_sum(int arr[],int target){
        int n = arr.length;
        boolean dp[][] = new boolean[n][target+1];
        for(int i=0;i<n;i++){
            dp[i][0] = true;
        }
        if(arr[0]<=target){
            dp[0][arr[0]] = true;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=target;j++){
                boolean not_take = dp[i-1][j];
                boolean take = false;
                if(j>=arr[i]){
                    take = dp[i-1][j-arr[i]];
                }
                dp[i][j] = take || not_take;
            }
        }
        return dp[n-1][target];
    }
    // Recursion
    // public static boolean is_subset_sum(int arr[],int target){
    //     int n = arr.length;
    //     return func(n-1,target,arr);
    // }
    // private static boolean func(int ind,int target,int arr[]){
    //     if(target==0) return true;
    //     if(ind==0) return arr[0]==target;
    //     boolean not_take = func(ind-1,target,arr);
    //     boolean take = false;
    //     if(target>=arr[ind]){
    //         take = func(ind-1,target-arr[ind],arr);
    //     }
    //     return take || not_take;
    // }

    public static void main(String[] args){
        int arr[] = {1,2,3,4};
        int target = 6;
        boolean ans = is_subset_sum(arr,target);
        System.out.println(ans);
    }
}
