import java.util.Scanner;
public class rec1 {
    public static void func(int i , int n ){
        if(i>n) return;
        System.out.println("Boss Baby");
        func(i+1,n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of times:");
        int n = sc.nextInt();
        func(1,n);
    }
}