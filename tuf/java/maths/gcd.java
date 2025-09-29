import java.util.Scanner;

public class gcd {
    public static void find_gcd (int a , int b) {
        // Euclidean Algorithm for finding GCD
        while(a>0 && b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0) System.out.println("GCD : "+b);
        else System.out.println("GCD : "+a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int n2 = sc.nextInt();
        find_gcd(n1, n2);
    }
}
