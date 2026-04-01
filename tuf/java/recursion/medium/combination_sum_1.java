import java.util.*;
public class combination_sum_1 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(0,list,ans,candidates,target,n);
        return ans;
    }

    private static void solve(
        int ind,
        List<Integer> list,
        List<List<Integer>> ans,
        int[] arr,
        int sum,
        int n){
            if(sum==0){
                ans.add(new ArrayList<>(list));
                return;
            }
            if(ind==n || sum<0){
                return;
            }
            list.add(arr[ind]);
            solve(ind,list,ans,arr,sum-arr[ind],n);
            list.remove(list.size()-1);
            solve(ind+1,list,ans,arr,sum,n);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of candidates: ");
        int n = sc.nextInt();
        int[] candidates = new int[n];
        System.out.println("Enter the candidates:");
        for (int i = 0; i < n; i++) {
            candidates[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        combination_sum_1 solution = new combination_sum_1();
        List<List<Integer>> result = solution.combinationSum(candidates, target);
        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
        sc.close();
    }   
}
