import java.util.*;
public class max_sum_non_adj_elements {
    public static int maxSum(int[]  arr){
        //space optimization
        int n = arr.length;
        int prev = arr[0];
        int prev2 =0;
        for(int i=1;i<n;i++){
            int pick = arr[i];
            if(i>1){
                pick += prev2;
            }
            int not_pick = prev;
            int curr = Math.max(pick,not_pick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
        
        //tabulation
        // int n = arr.length;
        // int [] dp = new int[n];
        // dp[0] = arr[0];
        // for(int i=1;i<n;i++){
        //     int pick = arr[i];
        //     if(i>1){
        //         pick += dp[i-2];
        //     }
        //     int not_pick = dp[i-1];
        //     dp[i] = Math.max(pick,not_pick);
        // }
        // return dp[n-1];
    }
    //memoization
    // private static int func(int ind, int [] arr, int[] dp){
    //     if(ind==0) return arr[ind];
    //     if(ind<0) return 0;
    //     if(dp[ind]!=-1) return dp[ind];
    //     int pick = arr[ind] + func(ind-2,arr,dp);
    //     int not_pick = func(ind-1,arr,dp);
    //     return dp[ind] = Math.max(pick,not_pick);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum sum of non-adjacent elements is: "+maxSum(arr));
        sc.close();
    }
}
