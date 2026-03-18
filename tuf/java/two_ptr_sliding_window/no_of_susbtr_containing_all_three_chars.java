import java.util.*;
public class no_of_susbtr_containing_all_three_chars {
    public static int no_of_substr(String s){
        int cnt=0;
        int ls[] = {-1,-1,-1};

        for(int i=0;i<s.length();i++){
            ls[s.charAt(i)-'a']=i;
            if(ls[0]!=-1 && ls[1]!=-1 && ls[2]!=-1){
                cnt += 1 + Math.min(Math.min(ls[0],ls[1]),ls[2]);
            }
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.next();
        System.out.println("The number of substrings containing all three characters is :");
        System.out.println(no_of_substr(s));
        sc.close();
    }
}
