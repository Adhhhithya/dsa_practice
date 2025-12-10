import java.util.*;
public class postfix_to_prefix {
    public static String postfixToprefix(String s){
        Stack<String> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }else{
                String t1 = st.pop();
                String t2 = st.pop();
                String con = c+t2+t1;
                st.push(con);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Postfix Expression :");
        String postfix = sc.nextLine();
        String prefix = postfixToprefix(postfix);
        System.out.println("Prefix Expression :"+prefix);
        sc.close();
    }
}
