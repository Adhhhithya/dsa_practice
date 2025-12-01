import java.util.*;
public class reverse_words_in_string {
    public  String reverse_words(String s){
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                word.append(ch);
            } else {
                if(word.length() > 0){
                    words.add(word.toString());
                    word.setLength(0);
                }
            }
        }
        if(word.length()>0){
            words.add(word.toString());
        }
        Collections.reverse(words);
        return String.join(" ",words);
    }
    public static void main(String args[]){
        reverse_words_in_string obj = new reverse_words_in_string();
        String s="Name my Say";
        System.out.println(obj.reverse_words(s));
    }
}
