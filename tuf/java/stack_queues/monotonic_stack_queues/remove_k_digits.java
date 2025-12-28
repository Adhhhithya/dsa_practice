import java.util.*;
public class remove_k_digits {
    public String removeKdigits(String num, int k){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++){
            char digit = num.charAt(i);
            while(!st.isEmpty() && k >0 && st.peek()>digit){
                st.pop();
                k--;
            }
            st.push(digit);
        }
        while(k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()){
            return "0";
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        while(res.length()>0 && res.charAt(res.length()-1)=='0'){
            res.deleteCharAt(res.length()-1);
        }
        res.reverse();
        if(res.length()==0){
            return "0";
        }
        return res.toString();
    }
    public static void main(String[] args){
        remove_k_digits obj = new remove_k_digits();
        String num = "1432219";
        int k = 3;
        String result = obj.removeKdigits(num, k);
        System.out.println("Result after removing " + k + " digits: " + result);
    }
}
