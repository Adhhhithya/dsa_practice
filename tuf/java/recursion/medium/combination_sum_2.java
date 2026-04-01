import java.util.*;
public class combination_sum_2 {
    public static List<List<Integer>> combination_sum(int[] candidates, int target){
        int n = candidates.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
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
            solve(ind+1,list,ans,arr,sum-arr[ind],n);
            list.remove(list.size()-1);
            for(int j=ind+1;j<n;j++){
                if(arr[j]!=arr[ind]){
                    solve(j,list,ans,arr,sum,n);
                    break;
                }
            }
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
            List<List<Integer>> result = combination_sum(candidates, target);
            System.out.println("Combinations that sum to " + target + ":");
            for (List<Integer> combination : result) {
                System.out.println(combination);
            }
            sc.close();   
        }
}
