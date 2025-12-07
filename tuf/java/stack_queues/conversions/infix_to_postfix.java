import java.util.Scanner;
import java.util.Stack;
public class infix_to_postfix {
    private static String infixTopostfix(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(Character.isLetterOrDigit(c)){
                ans.append(c);
            }else if(c=='('){
                st.push(c);
            }else if(c==')'){
                while(st.peek()!='('){
                    ans.append(st.pop());
                }
                st.pop();
            }else{
                while(!st.isEmpty() && precedence(c)<=precedence(st.peek())){
                    ans.append(st.pop());
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        return ans.toString();

    }

    private static int precedence(char c){
        if(c=='^'){
            return 3;
        }else if(c=='*'||c=='/'){
            return 2;
        }else if(c=='+'||c=='-'){
            return 1;
        }else{
            return -1;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Infix Expression :");
        String s = sc.nextLine();
        String postfix = infixTopostfix(s);
        System.out.println("Postfix Expression :"+postfix);
        sc.close();
    }
}
