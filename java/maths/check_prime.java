import java.util.Scanner;
public class check_prime {
    public static void is_prime (int n){
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if((n/i)!=i){
                    count++;
                }
            }
        }
        if(count == 2)  System.out.println(n+" is a prime number");
        else System.out.println(n+" is not a prime number");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        is_prime(n);
    }
}
