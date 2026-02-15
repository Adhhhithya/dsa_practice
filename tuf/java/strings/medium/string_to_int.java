import java.util.*;
public class string_to_int {
    public static int string_to_int_atoi(String s){
        int n = s.length();
        int i=0;

        while(i<n && s.charAt(i)==' '){
            i++;
        }
        int sign =1;
        if(i<n && s.charAt(i)=='-'){
            sign = -1;
            i++;
        }else if(i<n && s.charAt(i)=='+'){
            i++;
        }

        long res =0;
        while(i<n && Character.isDigit(s.charAt(i))){
            res = res*10 + (s.charAt(i)-'0');
            i++;
            if(res*sign >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(res*sign <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int)(res*sign);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int result = string_to_int_atoi(s);
        System.out.println("Integer value: " + result);
        sc.close();
    }
}
