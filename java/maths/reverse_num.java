import java.util.*;  

public class reverse_num {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        long rev = 0;  
        
        while(num != 0) {  
            int last = num % 10;
            rev = rev * 10 + last;
            num /= 10;

            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                System.out.println("Number overflow occurred!");
                return;  
            }
        }
        
        System.out.println("Reverse of the number is: " + (int)rev);
        sc.close();  
    }
}