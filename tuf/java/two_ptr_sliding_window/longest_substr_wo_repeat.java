import java.util.*;
public class longest_substr_wo_repeat {
        public static int longest_substr(String s){
            int [] hash = new int[256];
            Arrays.fill(hash,-1);
            int l=0,r=0,max_len=0;
            int n = s.length();
            while(r<n){
                if(hash[s.charAt(r)]!=-1){
                    if(hash[s.charAt(r)]>=l){
                        l = hash[s.charAt(r)]+1;
                    }
                }
                int len = r-l+1;
                max_len = Math.max(max_len,len);
                hash[s.charAt(r)]=r;
                r++;
            }
            return max_len;
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string:");
            String s = sc.nextLine();
            int ans = longest_substr(s);
            System.out.println("Length of the longest substring without repeating characters: "+ans);
            sc.close();
        }
}
