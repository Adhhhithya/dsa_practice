import java.util.*;
public class removing_max_char {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     int freq[] = new int[26];
     for(char c: s.toCharArray()){
        freq[c-'a']++;
     }
     
     int max_freq = 0;
     for(int i=0;i<freq.length;i++){
        max_freq = Math.max(max_freq,freq[i]);
     }
     StringBuilder sb = new StringBuilder();
     for(char ch : s.toCharArray()){
        if(freq[ch-'a']!=max_freq){
            sb.append(ch);
        }
     }
     System.out.println(sb.toString());
     sc.close();
    }
}
