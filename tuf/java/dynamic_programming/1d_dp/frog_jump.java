import java.util.*;
public class frog_jump {
    public static int frogJump(int heights[]){
        int n = heights.length;
        int prev =0;
        int prev2 = 0;
        for(int i=2;i<n;i++){
            int first = prev + Math.abs(heights[i] - heights[i-1]);
            int second = Integer.MAX_VALUE;
            if(i>1){
                second = prev2 + Math.abs(heights[i] - heights[i-2]);
            }
            int curr = Math.min(first,second);
            prev2 = prev;
            prev = curr;
        }
        return prev;
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
        System.out.println("The minimum energy required to reach the top is: "+frogJump(heights));
        sc.close();
    }
}
