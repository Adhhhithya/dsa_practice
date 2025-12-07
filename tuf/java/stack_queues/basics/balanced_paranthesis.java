import java.util.Stack;

public class balanced_paranthesis {

    public boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) return false;
                char top = st.pop();
                if (!((ch == ')' && top == '(') ||
                      (ch == '}' && top == '{') ||
                      (ch == ']' && top == '['))) {
                    return false;
                }
            } 
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        balanced_paranthesis b = new balanced_paranthesis();
        String[] tests = {"()[]{}", "([{}])", "(]", "([)]", ""};
        for (String t : tests) {
            System.out.println(t + " -> " + b.isBalanced(t));
        }
    }
}
