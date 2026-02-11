import java.util.*;
class Pair{
    int freq;
    char ch;
    Pair(int f,char c){
        this.freq = f;
        this.ch =c;
    }
}
public class sort_char_by_freq {
    public static List<Character> sort_by_freq(String s){
        Pair[] freq = new Pair[26];

        for(int i=0;i<26;i++){
            freq[i] = new Pair(0,(char)(i+'a'));
        }

        for(char ch : s.toCharArray()){
            freq[ch-'a'].freq++;
        }
        Arrays.sort(freq,(a,b)->{
            if(a.freq!=b.freq) return b.freq - a.freq;
            return a.ch - b.ch;
        });

        List<Character> result = new ArrayList<>();
        for(Pair p : freq){
            if(p.freq>0){
                result.add(p.ch);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        List<Character> sortedChars = sort_by_freq(s);
        System.out.println("Characters sorted by frequency: " + sortedChars);
        sc.close();
    }
}
