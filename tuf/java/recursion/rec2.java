import java.util.Scanner;
public class rec2{
    public static void func(int i , int n ){
        if(i>n) return;
        System.out.print(i+" ");
        func(i+1,n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number N :");
        int n = sc.nextInt();
        func(1,n);
    }
}