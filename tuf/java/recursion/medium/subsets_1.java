import java.util.*;
public class subsets_1 {
    public static List<Integer> sum_subset(int arr[]){
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        solve(0,0,arr,ans,n);
        return ans;
    }
    private static void solve(
        int ind,
        int sum,
        int arr[],
        List<Integer> ans,
        int n
    ){
        if(ind==n){
            ans.add(sum);
            return;
        }
        //take
        solve(ind+1,sum+arr[ind],arr,ans,n);
        //not take
        solve(ind+1,sum,arr,ans,n);
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
        List<Integer> ans = sum_subset(arr);
        Collections.sort(ans);
        System.out.println("The sum of subsets are:");
        for(int i:ans){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
