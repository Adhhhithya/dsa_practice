import java.util.*;
public class check_subsequence_sum_k {
    public static boolean check_subsequence(int [] nums,int k){
        int n = nums.length;
        return solve(0,n,nums,k);
    }
    private static boolean solve(int ind,int n,int[] arr,int k){
        if(k==0) return true;
        if(ind==n || k<0) return false;
        //take
        boolean path_1 = solve(ind+1,n,arr,k-arr[ind]);
        boolean path_2 = solve(ind+1,n,arr,k);
        return path_1 || path_2;
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
        boolean result = check_subsequence(nums, k);
        if (result) {
            System.out.println("There exists a subsequence that sums to " + k);
        } else {
            System.out.println("No subsequence sums to " + k);
        }
        sc.close();
    }
}
