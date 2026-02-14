import java.util.*;
public class center_alignment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        String largest =str[0];
        for(int i=0;i<n;i++){
            if(str[i].length()>largest.length()){
                largest = str[i];
            }
        }
        int m = largest.length();

        List<String> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(str[i].length()<m){
                int k = (m - str[i].length());
                int left = k/2;
                int right = k-left;
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<left;j++){
                    sb.append(".");
                }
                sb.append(str[i]);
                for(int j=0;j<right;j++){
                    sb.append(".");
                }
                ans.add(sb.toString());
            }
            else{
                ans.add(str[i]);
            }
        }
        for(String s: ans){
            System.out.println(s);
        }
        sc.close();
    }
}
