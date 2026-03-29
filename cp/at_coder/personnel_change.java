import java.util.*;
public class personnel_change {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int diff[] = new int[m+1];

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            diff[a]--;
            diff[b]++;
        }
        for(int i=1;i<=m;i++){
            System.out.println(diff[i]);
        }
        sc.close();
    }
}
