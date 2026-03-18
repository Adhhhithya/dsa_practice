import java.util.*;
public class longest_repeating_character_replacement {
    public static int longest_repeating_char(String s,int k){
        int l =0,r=0,maxlen=0,maxfreq=0;
        int hash[] = new int[26];

        while(r < s.length()){
            hash[s.charAt(r)-'A']++;
            maxfreq = Math.max(maxfreq,hash[s.charAt(r)-'A']);

            while((r-l+1)-maxfreq > k){
                hash[s.charAt(l)-'A']--;
                maxfreq =0;
                for(int i=0;i<26;i++){
                    maxfreq = Math.max(maxfreq,hash[i]);
                }
                l = l+1;
            }
            if((r-l+1)-maxfreq <=k){
                maxlen = Math.max(maxlen,r-l+1);
            }
            r = r+1;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k :");
        int k = sc.nextInt();
        System.out.println("Enter the string :");
        String s = sc.next();
        System.out.println("The longest substring with atmost k distinct characters is :");
        System.out.println(longest_repeating_char(s,k));
        sc.close();
    }
}
