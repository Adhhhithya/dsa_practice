import java.util.Scanner;
public class check_prime {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        return primer(2,n);
    }
    private static boolean primer(int i,int n){
        if(i>=n) return true;
        if(n%i==0) return false;
        return primer(i+1,n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }
        sc.close();
    }

}
