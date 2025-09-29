public class count_digit {
    public static void main(String[] args) {
        int n = 1987658396;
        
        // division method
        int count = 0;
        int num1 = n;  
        while(num1 > 0) {
            int last = num1 % 10;
            count += 1;
            num1 /= 10;
        }
        System.out.println("The no. of digits (div method): " + count);
        
        // log method
        int cnt = (int)(Math.log10(n) + 1);
        System.out.println("The no. of digits (log method): " + cnt);
    }
}