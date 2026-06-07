import java.util.*;
public class buy_sell_stock_1 {
    public int stockBuySell(int[] arr, int n) {
       int profit =0;
       int mini = arr[0];
       for(int i=1;i<n;i++){
        int  cost = arr[i]-mini;
        profit = Math.max(profit,cost);
        mini = Math.min(mini,arr[i]);
       }
       return profit;
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
        buy_sell_stock_1 bss = new buy_sell_stock_1();
        int ans = bss.stockBuySell(arr,n);
        System.out.println("Maximum profit: "+ans);
        sc.close();
    }
}
