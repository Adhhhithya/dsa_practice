import java.util.Scanner;
public class buy_sell_stocks {
    public static int maxProfit(int prices[]){
        int n = prices.length;
        int mini = prices[0];
        int profit = 0;
        for(int i=1;i<n;i++){
            int cost = prices[i]-mini;
            profit = Math.max(profit,cost);
            mini = Math.min(mini,prices[i]);
        }
        return profit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the prices of the stocks:");
        int prices[] = new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        int ans = maxProfit(prices);
        System.out.println("The maximum profit is : "+ans);
        sc.close();
    }
}
