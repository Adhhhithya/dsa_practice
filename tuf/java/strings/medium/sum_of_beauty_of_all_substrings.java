import java.util.*;
public class sum_of_beauty_of_all_substrings {
    public static int beauty_sum(String s){
        int n = s.length();
        int sum =0;

        for(int i=0;i<n;i++){
            Map<Character,Integer> freq = new HashMap<>();
            for(int j=i;j<n;j++){
                freq.put(s.charAt(j),freq.getOrDefault(s.charAt(j),0)+1);
                int mini = Integer.MAX_VALUE;
                int maxi = Integer.MIN_VALUE;

                for(int val: freq.values()){
                    mini = Math.min(mini,val);
                    maxi = Math.max(maxi,val);
                
                }
                sum+= (maxi-mini);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        int result = beauty_sum(s);
        System.out.println("Sum of beauty of all substrings: " + result);
        sc.close();
    }
}
