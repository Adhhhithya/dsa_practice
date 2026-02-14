import java.util.*;
public class strong_word {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n=s.length();
        char ch[] = s.toCharArray();
        if(ch[0]==ch[n-1]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
