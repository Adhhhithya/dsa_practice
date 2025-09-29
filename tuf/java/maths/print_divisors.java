import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class print_divisors {
    public static void divisors(int n) {
        ArrayList <Integer> div = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                div.add(i);
                if((n/i)!=i){
                    div.add(n/i);
                }
            }
        }
        Collections.sort(div);
        System.out.println("Divisors:"+div);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        divisors(n);
        sc.close();
    }
}
