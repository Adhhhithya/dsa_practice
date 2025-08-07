import java.util.*;

public class Armstrong {
    public static boolean isArmstrong(int n) {
        int temp = n;  
        int k = (int)(Math.log10(n) + 1);  
        int sum = 0;
        
        while (temp > 0) {
            int last = temp % 10;
            sum += Math.pow(last, k);
            temp /= 10;
        }
        
        return sum == n;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
        
        sc.close();  
    }
}