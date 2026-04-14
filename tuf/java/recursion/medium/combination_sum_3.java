import java.util.*;

public class combination_sum_3{
    public static List<List<Integer>> combination(int n,int k){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(n,list,ans,k);
        return ans;
    }

    private static void solve(int sum,List<Integer> list, List<List<Integer>> ans, int k){
        if(sum==0 && list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum <0 || list.size()>k){
            return;
        }
        int element = list.isEmpty() ? 1 : list.get(list.size()-1) +1;
        for(int i=element;i<=9;i++){
            if(i<=sum){
                list.add(i);
                solve(sum-i,list,ans,k);
                list.remove(list.size()-1);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum:");
        int n = sc.nextInt();
        System.out.println("Enter the number of elements:");
        int k = sc.nextInt();
        List<List<Integer>> res = combination_sum_3.combination(n,k);
        System.out.println("Combinations are:");
        for(List<Integer> list: res){
            System.out.println(list);
        }
        sc.close();
    }
}