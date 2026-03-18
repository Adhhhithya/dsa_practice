import java.util.*;
public class minimum_window_substring {
    public static String min_string(String s, String t){
        int l=0,r=0,cnt=0;
        int hash[] = new int[256];
        int s_idx =-1;
        int minlen = Integer.MAX_VALUE;
        int n = s.length();
        int m = t.length();

        for(char c : t.toCharArray()){
            hash[c]++;
        }
        while(r < n){
            if(hash[s.charAt(r)]>0) cnt++;
            hash[s.charAt(r)]--;

            while(cnt == m){
                if(r-l+1 <  minlen){
                    minlen = r-l+1;
                    s_idx = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0) cnt--;
                l = l+1;
            }
            r = r+1;
        }
        return (s_idx==-1) ? "" : s.substring(s_idx, s_idx+minlen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string s :");
        String s = sc.next();
        System.out.println("Enter the string t :");
        String t = sc.next();
        System.out.println("The minimum window substring is :");
        System.out.println(min_string(s,t));
        sc.close();
    }
}
