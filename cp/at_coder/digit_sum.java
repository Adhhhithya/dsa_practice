import java.util.Scanner;

public class digit_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt =0;
        for(int i=1;i<=n;i++){
            if (check_sum(i,k)){
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
    public static boolean check_sum(int num , int k){
        int sum =0;
        while(num>0){
            int digit = num%10;
            sum+=digit;
            num=num/10;
        }
        return sum==k;
    }
}
