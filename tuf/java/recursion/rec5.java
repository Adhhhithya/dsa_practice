import java.util.Scanner;
public class rec5 {
    public static void func(int i, int n) {
        if (i < 1) {
            return;
        }
        System.out.print(i + " ");
        func(i - 1, n);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        func(n, n);
        sc.close();
    }
}