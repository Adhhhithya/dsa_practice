import java.util.*;
public class fibonacci{
    public static int fib(int n,int[]dp,int prev,int prev2){
        if(n<=1) return n;
        for(int i=2;i<=n;i++){
            int curr = prev + prev2;
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int dp[] = new  int[n+1];
        Arrays.fill(dp,-1);
        int prev = 1;
        int prev2 = 0;
        System.out.println("The "+n+"th Fibonacci number is: "+fib(n,dp,prev,prev2));
        sc.close();
    }
}