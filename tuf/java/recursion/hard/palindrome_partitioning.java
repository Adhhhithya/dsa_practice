import java.util.*;
public class palindrome_partitioning {
    public static List<List<String>> palindrome_partition(String s){
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        solve(0,s,list,ans,s.length());
        return ans;
    }
    private static void solve(
        int ind,
        String s,
        List<String> list,
        List<List<String>> ans,
        int n 
    ){
        if(ind==n){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int j=ind;j<n;j++){
            if(check_palindrome(s,ind,j)){
                list.add(s.substring(ind,j+1));
                solve(j+1,s,list,ans,n);
                list.remove(list.size()-1);
            }
        }
    }

    private static boolean check_palindrome(String s, int l, int r){
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        List<List<String>> res = palindrome_partition(s);
        System.out.println("Palindrome partitions are:");
        for(List<String> list: res){
            System.out.println(list);
        }
        sc.close();
    }
}
