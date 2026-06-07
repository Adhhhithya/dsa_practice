import java.util.*;
public class buy_sell_stock2 {
        public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n][2];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return func(0,1,prices,dp,n);
    }

    private static int func(int ind,int buy,int arr[],int dp[][],int n){
        if(ind==n){
            return 0;
        }
        if(dp[ind][buy]!=-1){
            return dp[ind][buy];
        }

        int profit =0;
        //buy
        if(buy==1){
            profit = Math.max(
                (-1)*arr[ind] + func(ind+1,0,arr,dp,n), //buy
                func(ind+1,1,arr,dp,n) // not buy
            );
        }
        //sell
        if(buy==0){
            profit = Math.max(
                arr[ind] + func(ind+1,1,arr,dp,n), //sell
                func(ind+1,0,arr,dp,n)  //not sell
            );
        }
        return dp[ind][buy] = profit;
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
        buy_sell_stock2 bss2 = new buy_sell_stock2();
        int ans = bss2.maxProfit(arr);
        System.out.println("Maximum profit: "+ans);
        sc.close();
    }   
}
