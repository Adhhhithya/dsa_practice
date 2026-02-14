import java.util.*;
public class maximum_nesting_depth_paranthesis {
    public static int max_depth(String s){
        int ans =0;
        int p=0;
        for(char ch : s.toCharArray()){
            if(ch=='(') p++;
            else if(ch==')') p--;
            ans = Math.max(ans,p);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of parentheses: ");
        String s = sc.nextLine();
        int depth = max_depth(s);
        System.out.println("Maximum nesting depth of parentheses: " + depth);
        sc.close();
    }
}
