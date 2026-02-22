import java.util.Scanner;
public class sum_n_nos {
    public static int sum(int n){
        if(n==1) return 1;
        return n+sum(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Sum of first "+n+" natural numbers is "+sum(n));
        sc.close();
    }
}
