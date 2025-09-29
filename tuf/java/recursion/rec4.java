import java.util.Scanner;
public class rec4 {
    public static void func(int i , int n){
        if(i<1) return ;
        func(i-1,n);
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        func(n,n);
    }
}
