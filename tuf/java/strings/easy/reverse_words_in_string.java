import java.util.*;
public class reverse_words_in_string {
    public  String reverse_words(String s){
        int n = s.length();
        List<String> words = new ArrayList<>();
        int start ,end;
        int i=0;
        while(i<n){
            while(i<n && s.charAt(i)==' ')i++;
            if(i>=n) break;
            start =i;
            while(i<n && s.charAt(i)!=' ')i++;
            end=i-1;
            String word = s.substring(start,end+1);
            words.add(word);
        }
        StringBuilder ans = new StringBuilder();
        for(int j=words.size()-1;j>=0;j--){
            ans.append(words.get(j));
            if(j!=0) ans.append(' ');
        }
        return ans.toString();
    }
    public static void main(String args[]){
        reverse_words_in_string obj = new reverse_words_in_string();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Reversed words string is:");
        System.out.println(obj.reverse_words(s));
    }
}
