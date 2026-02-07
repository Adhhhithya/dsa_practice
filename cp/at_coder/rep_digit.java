import java.util.Scanner;
public class rep_digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n/100;
        int b = (n/10)%10;
        int c = n%10;
        if(a==b && b==c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
