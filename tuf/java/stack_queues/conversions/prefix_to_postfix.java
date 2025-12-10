import java.util.*;
public class prefix_to_postfix {
    public static String prefixTopostfix(String s){
        Stack<String> st = new Stack<>();
        int n =s.length();
        for(int i=n-1;i>=0;i--){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }else{
                String t1=st.pop();
                String t2 = st.pop();
                String con = t1+t2+c;
                st.push(con);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Prefix Expression :");
        String prefix = sc.nextLine();
        String postfix = prefixTopostfix(prefix);
        System.out.println("Postfix Expression :"+postfix);
        sc.close();
    }
}
