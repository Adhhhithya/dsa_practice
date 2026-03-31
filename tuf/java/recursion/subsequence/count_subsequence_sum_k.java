import java.util.*;
public class count_subsequence_sum_k {
    public static int count_subsqeuence(int[]nums,int k){
        int n = nums.length;
        return solve(0,n,nums,k);
    }
    private static int solve(int ind,int n,int[] nums,int k){
        if(k==0) return 1;
        if(ind==n || k<0)  return 0;
        int path_1 = solve(ind+1,n,nums,k-nums[ind]);
        int path_2 = solve(ind+1,n,nums,k);
        return path_1+path_2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum (k): ");
        int k = sc.nextInt();
        int result = count_subsqeuence(nums, k);
        System.out.println("The number of subsequences that sum to " + k + " is: " + result);
        sc.close();
    }
}