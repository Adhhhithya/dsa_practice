import java.util.*;
public class subset_2 {
    public static List<List<Integer>> subset_unique(int arr[]){
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        solve(0,list,ans,arr,n);
        return ans;
    }
    private static void solve(
        int ind,
        List<Integer> list,
        List<List<Integer>> ans,
        int arr[],
        int n
    ){
        if(ind==n){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[ind]);
        solve(ind+1,list,ans,arr,n);
        list.remove(list.size()-1);
        for(int i=ind+1;i<n;i++){
            if(arr[i]!=arr[ind]){
                solve(i,list,ans,arr,n);
                return;
            }
        }
        solve(n,list,ans,arr,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> ans = subset_unique(arr);
        System.out.println("The unique subsets are:");
        for(List<Integer> list:ans){
            System.out.println(list);
        }
        sc.close();
    }
}
