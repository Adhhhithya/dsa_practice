import java.util.*;
public class hand_maid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append("Of");
        sb.append(s);
        System.out.println(sb.toString());
        sc.close();
    }
}
