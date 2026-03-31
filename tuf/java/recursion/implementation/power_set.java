import java.util.*;
public class power_set {
    private static void backtrack(
        int ind,
        List<Integer> curr,
        List<List<Integer>> ans,
        int[] nums,
        int n
    ){
        if(ind==n){
            ans.add(new ArrayList<>(curr));
            return;
        }
        ///non take
        backtrack(ind+1, curr, ans, nums, n);
        curr.add(nums[ind]);
        //take
        backtrack(ind+1, curr, ans, nums, n);
        curr.remove(curr.size()-1);
    }
    public static List<List<Integer>> generate_power_set(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(0 ,curr, ans, nums, nums.length);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the set: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the set:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> result = generate_power_set(nums);
        System.out.println("Generated power set:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
        sc.close();
    }   
}
