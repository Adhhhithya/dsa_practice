import java.util.*;
public class isomorphic_strings {
    public static boolean is_isomorphic(String s, String t){
        int[] s_map = new int[256];
        int[] t_map = new int[256];

        for(int i=0;i<s.length();i++){
            if(s_map[s.charAt(i)]!=t_map[t.charAt(i)]){
                return false;
            }
            s_map[s.charAt(i)] = i+1;
            t_map[t.charAt(i)] = i+1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s = sc.nextLine();
        System.out.print("Enter the second string: ");
        String t = sc.nextLine();
        boolean result = is_isomorphic(s, t);
        if(result){
            System.out.println("The strings are isomorphic.");
        } else {
            System.out.println("The strings are not isomorphic.");
        }
        sc.close();
    }
}
