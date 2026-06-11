
import java.util.*;
public class count_partition_with_given_diff {
    public static int count_paritions(int arr[],int diff){
        int n = arr.length;
        int total_sum=0;
        for(int i=0;i<n;i++) total_sum += arr[i];
        if(total_sum-diff<0 ||(total_sum-diff)%2==1) return 0;
        int dp[][] = new int[n][total_sum+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return func(n-1,(total_sum-diff)/2,arr,dp);
    }
    private static int func(int ind,int sum,int arr[],int dp[][]){
        if(ind==0){
            if(sum==0 && arr[0]==0) return 2;
            if(sum==0 || sum==arr[0]) return 1;
            return 0;
        }
        if(dp[ind][sum]!=-1) return dp[ind][sum];
        int not_take = func(ind-1,sum,arr,dp);
        int take =0;
        if(arr[ind]<=sum){
            take = func(ind-1,sum-arr[ind],arr,dp);
        }
        return dp[ind][sum] = take + not_take;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4};
        int diff = 2;
        int ans = count_paritions(arr,diff);
        System.out.println(ans);
    }
}
