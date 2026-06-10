import java.util.*;
public class partition_equal_subset_sum {
    public static boolean can_partition(int[] arr){
        int sum = Arrays.stream(arr).sum();
        if(sum%2==1) return false;
        return func(arr.length-1,sum/2,arr);
    }
    private static boolean func(int ind,int k,int arr[]){
        int n = arr.length;
        boolean prev[] = new boolean[k+1];
        prev[0] = true;
        for(int i=0;i<n;i++){
            boolean curr[] = new boolean[k+1];
            curr[0] = true;
            for(int target=1;target<=k;target++){
                boolean not_take = prev[target];
                boolean take = false;
                if(arr[i]<=target){
                    take = prev[target-arr[i]];
                }
                curr[target] = take || not_take;
            }
            prev = curr;
        }
        return prev[k];
    }

    public static void main(String[] args) {
        int arr[] = {1,5,11,5};
        System.out.println(can_partition(arr));
    }
}
