import java.util.Scanner;
public class rec6 {
    public static void func(int i,int sum){
        if(i<1){
            System.out.print(sum);
            return;
        }
        func(i-1,sum+i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        func(n,0);
    }
}
