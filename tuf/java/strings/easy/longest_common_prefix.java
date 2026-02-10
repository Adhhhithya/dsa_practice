import java.util.*;
public class longest_common_prefix {
    public String longest_common(String[] strs){
        StringBuilder ans = new StringBuilder();
        String first = strs[0];
        String last = strs[strs.length-1];

        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString(); 
    }

    public static void main(String args[]){
        longest_common_prefix obj = new longest_common_prefix();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for(int i=0;i<n;i++){
            strs[i] = sc.nextLine();
        }
        System.out.println("Longest common prefix is:");
        System.out.println(obj.longest_common(strs));
    }
}
