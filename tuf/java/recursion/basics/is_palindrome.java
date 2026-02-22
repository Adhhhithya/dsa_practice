import java.util.Scanner;
public class is_palindrome {
    public static boolean isPalindrome(String s){
        int left =0;
        int right = s.length()-1;
        return check_palindrome(s,left,right);
    }
    private static boolean check_palindrome(String s,int left,int right){
        if(left>=right) return true;
        if(s.charAt(left)!=s.charAt(right)) return false;
        return check_palindrome(s,left+1,right-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Is the string a palindrome? "+isPalindrome(str));
        sc.close();
    }
}
