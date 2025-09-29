import java.util.*;

public class palindrome {
     public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        if (x < 0){
            System.out.println("The no. is not a palindrome");
        }

        int original = x;
        int rev = 0;

        while (x != 0) {
            int last = x % 10;
            if (rev > (Integer.MAX_VALUE - last) / 10) {
                System.out.println("The maximum flow reached");
            }

            rev = rev * 10 + last;
            x = x / 10;
        }

        if( original == rev){
            System.out.println("The no. is a palindrome");
        }
        else{
            System.out.println("The no. is not a palindrome");
        }
}
}