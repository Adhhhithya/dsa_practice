import java.util.Scanner;
import java.util.Stack;
public class postfix_to_infix {
    private static String postfixToInfix(String postfix){
        Stack<String> st = new Stack<>();
        int n = postfix.length();
        for(int i=0;i<n;i++){
            char c = postfix.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }else{
                String t2 = st.pop();
                String t1 = st.pop();
                String con = "("+t1+c+t2+")";
                st.push(con);
            }
        }
        return st.peek();
    }

    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter Postfix Expression :");
        String postfix = sc.nextLine();
        String infix = postfixToInfix(postfix);
        System.out.println("Infix Expression :"+infix);
        sc.close();
    }
}
