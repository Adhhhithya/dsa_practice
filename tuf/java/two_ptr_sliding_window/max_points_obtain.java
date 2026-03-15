import java.util.*;
public class max_points_obtain {
    public static int maxScore(int[] cardScore, int k) {
        int lsum=0,rsum=0,max_sum=0;
        int n = cardScore.length;

        for(int i=0;i<k;i++) {
            lsum = lsum + cardScore[i];
            max_sum = lsum;
        }
        int r_idx = n-1;

        for(int i=k-1;i>=0;i--){
            lsum = lsum - cardScore[i];
            rsum = rsum + cardScore[r_idx];
            r_idx--;
            max_sum = Math.max(max_sum,lsum+rsum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cards:");
        int n = sc.nextInt();
        int[] points = new int[n];
        System.out.println("Enter the points on each card:");
        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
        }
        System.out.println("Enter the number of cards to pick (k):");
        int k = sc.nextInt();
        int result = maxScore(points, k);
        System.out.println("Maximum points that can be obtained: " + result);
        sc.close();
    }
}