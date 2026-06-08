import java.util.*;
public class buy_sell_stock5 {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int dp[][] = new int[n][2];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return func(0,1,prices,dp,n,fee);
    }

    private static int func(int ind,int buy,int a[],int dp[][],int n, int fee){
        if(ind==n){
            return 0;
        }
        if(dp[ind][buy]!=-1){
            return dp[ind][buy];
        }
        int profit =0;
        if(buy==1){
            profit = Math.max(
                (-1)*a[ind] + func(ind+1,0,a,dp,n,fee),
                func(ind+1,1,a,dp,n,fee)
            );
        }

        if(buy==0){
            profit = Math.max(
                a[ind] - fee + func(ind+1,1,a,dp,n,fee),
                func(ind+1,0,a,dp,n,fee)
            );
        }
        return dp[ind][buy]=profit;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the stock prices:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the transaction fee:");
        int fee = sc.nextInt();
        buy_sell_stock5 bss5 = new buy_sell_stock5();
        int ans = bss5.maxProfit(arr,fee);
        System.out.println("Maximum profit: "+ans);
        sc.close();
    }
}
