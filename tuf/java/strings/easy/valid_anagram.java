import java.util.*;
public class valid_anagram {
    public static boolean is_anagram(String s, String t){
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        Arrays.sort(s_arr);
        Arrays.sort(t_arr);
        return Arrays.equals(s_arr, t_arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s = sc.nextLine();
        System.out.print("Enter the second string: ");
        String t = sc.nextLine();
        boolean result = is_anagram(s, t);
        if(result){
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        sc.close();
    }
}
