import java.util.*;
public class perfect_root {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of test cases : ");
        int t = sc.nextInt();
        while(t-- >0){
            System.out.println("Enter the no. of perfect roots to be found : ");
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
