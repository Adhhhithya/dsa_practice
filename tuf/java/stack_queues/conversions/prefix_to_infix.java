import java.util.*;
public class prefix_to_infix {
    public static String prefixToinfix(String s){
        Stack<String> st = new Stack<>();
        int n =s.length();
        for(int i=n-1;i>=0;i--){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }else{
                String t1 = st.pop();
                String t2 = st.pop();
                String con = "("+t1+c+t2+")";
                st.push(con);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Prefix Expression :");
        String prefix = sc.nextLine();
        String infix = prefixToinfix(prefix);
        System.out.println("Infix Expression :"+infix);
        sc.close();
    }
}
