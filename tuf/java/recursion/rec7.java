import java.util.Scanner;
public class rec7 {
    public static int func(int n){
        if(n==0) return 0 ;
        return n+func(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        System.out.println("Sum of first "+n+" natural numbers is: "+func(n));
    }
}
