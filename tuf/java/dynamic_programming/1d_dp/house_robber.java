import java.util.*;
public class house_robber{
    private static int max_amount(int arr[]){
        int n = arr.length;
        if(n==0) return 0;
        int prev = arr[0];
        int prev2 = 0;
        for(int i=1;i<n;i++){
            int pick = arr[i] + prev2;
            int not_pick = prev;
            int curr = Math.max(pick,not_pick);
            prev2 = prev;
            prev=curr;
        }
        return prev;
    }
    public static int rob(int money[]){
        int n = money.length;
        if(n==0) return 0;
        if(n==1) return money[0];
        int temp1[] = new int[n-1];
        int temp2[] = new int[n-1];
        for(int i=0;i<n;i++){
            if(i!=0){
                temp1[i-1] = money[i];
            }
            if(i!=n-1){
                temp2[i] = money[i];
            }
        }
        int ans1 = max_amount(temp1);
        int ans2 = max_amount(temp2);
        return Math.max(ans1,ans2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of houses:");
        int n= sc.nextInt();
        int money[] = new int[n];
        System.out.println("Enter the amount in each house");
        for(int i=0;i<n;i++){
            money[i] = sc.nextInt();
        }
        System.out.println("The Maximum Amount of Money that can be Robbed "+rob(money));
        sc.close();
    }
}