import java.util.Scanner;
public class sum_of_digits {
    public static int add_digits(int n){
        if(n<10) return n;
        int sum = sum_digits(n);
        return add_digits(sum);
    }
    private static int sum_digits(int n){
        if(n==0) return 0;
        return sum_digits(n/10) + (n%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("The sum of the digits is "+add_digits(n));
        sc.close();
    }
}
