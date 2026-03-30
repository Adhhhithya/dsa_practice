import java.util.*;
public class generate_paranthesis {
    public static List<String> generate_paranthesis(int n){
        List<String> res = new ArrayList<>();
        gen(0,"",0,0,res,n);
        return res;
    }
    private static void gen(int ind,String s,int open,int close,List<String> res,int n){
        if(open>n) return;
        if(open + close == 2*n && open==close){
            res.add(s);
            return;
        }
        gen(ind+1,s+'(',open+1,close,res,n);
        if(open>close){
            gen(ind+1,s+')',open,close+1,res,n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of pairs of parentheses (n): ");
        int n = sc.nextInt();
        List<String> result = generate_paranthesis(n);
        System.out.println("Generated parentheses combinations:");
        for (String combination : result) {
            System.out.println(combination);
        }
        sc.close();
    }
}
