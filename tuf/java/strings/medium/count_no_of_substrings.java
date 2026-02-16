import java.util.*;
public class count_no_of_substrings {
    public static int at_most_k_distinct(String s, int k){
        int left =0;
        int res =0;
        Map<Character,Integer> freq = new HashMap<>();

        for(int right =0;right <s.length();right++){
            freq.put(s.charAt(right),freq.getOrDefault(s.charAt(right), 0)+1);
            while(freq.size()>k){
                char leftChar = s.charAt(left);
                freq.put(leftChar,freq.get(leftChar)-1);
                if(freq.get(leftChar)==0){
                    freq.remove(leftChar);
                }
                left++;
            }
            res += (right -left +1);
        }
        return res;
    
    }

    public static int count_substrings(String s, int k){
        return at_most_k_distinct(s,k) - at_most_k_distinct(s,k-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        System.out.println("Number of substrings with exactly " + k + " distinct characters:");
        System.out.println(count_substrings(s,k));
        sc.close();
    }
}
