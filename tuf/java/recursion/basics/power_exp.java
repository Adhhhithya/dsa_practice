import java.util.*;
public class power_exp {
    public static double power(double x,int n){
        long num =n;
        if(num<0){
            return (1.0/pow(x,-num));
        }
        return pow(x,num);
    }
    private static double pow(double x,long n){
        if(n==0) return 1.0;
        if(n==1) return x;
        if(n%2==1){
            return x*pow(x,n-1);
        }
        return pow(x*x,n/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base (x): ");
        double x = sc.nextDouble();
        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();
        double result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
        sc.close();
    }
}
