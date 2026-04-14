import java.util.*;
public class letter_combination_ph_no {
    private String[] map;
    public letter_combination_ph_no(){
        map = new String[]{
            "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
         };
        }
    public List<String> letter_combinations(String digits){
        List<String> ans = new ArrayList<>();
        if(digits.length()==0) return ans;
        solve(0,digits,ans,"");
        return ans;
    }
    private void solve(int ind , String digits, List<String> ans, String curr){
        if(ind==digits.length()){
            ans.add(curr);
            return;
        }
        String s = map[digits.charAt(ind)-'0'];
        for(int i=0;i<s.length();i++){
            solve(ind+1,digits,ans,curr+s.charAt(i));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        String digits = sc.nextLine();
        letter_combination_ph_no lc = new letter_combination_ph_no();
        List<String> res = lc.letter_combinations(digits);
        System.out.println("Letter combinations are:");
        for(String s: res){
            System.out.println(s);
        }
        sc.close();
    }
}

