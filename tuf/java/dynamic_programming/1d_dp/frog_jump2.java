import java.util.*;
public class frog_jump2 {
    public static int frogJump(int[] heights, int k) {
        int n = heights.length;
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;

        for(int i=1;i<n;i++){
            int min_steps = Integer.MAX_VALUE;
            for(int j =1;j<=k;j++){
                if(i-j >=0){
                    int jump = dp[i-j] + Math.abs(heights[i] - heights[i-j]);
                    min_steps = Math.min(jump,min_steps);
                }
            }
            dp[i] = min_steps;
        }
        return dp[n-1];
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs: ");
        int n = sc.nextInt();
        int heights[] = new int[n];
        System.out.println("Enter the heights of the stairs: ");
        for(int i=0;i<n;i++){
            heights[i] = sc.nextInt();
        }
        System.out.println("Enter the maximum jump length: ");
        int k = sc.nextInt();
        System.out.println("The minimum energy required to reach the top is: "+frogJump(heights,k));
        sc.close();
    }
}
