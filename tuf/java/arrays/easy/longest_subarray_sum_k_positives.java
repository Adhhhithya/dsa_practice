import java.util.HashMap;
import java.util.*;
public class longest_subarray_sum_k_positives {
    public static int getLongestSubarray(int arr[],int k){
        //Better Aproach : Prefix sum + hashing
        // int n = arr.length;
        // Map<Long,Integer> preSumMap = new HashMap<>();
        // long sum =0;
        // int maxLen =0;
        // for(int i=0;i<n;i++){
        //     sum += arr[i];
        //     if(sum ==k){
        //         maxLen = Math.max(maxLen,i+1);
        //     }
        //     long rem = sum -k;
        //     if(preSumMap.containsKey(rem)){
        //         int len = i - preSumMap.get(rem);
        //         maxLen = Math.max(maxLen,len);
        //     }
        //     if(!preSumMap.containsKey(rem)){
        //         preSumMap.put(sum,i);
        //     }
        // }
        // return maxLen
        //=====================================================================================//
        //Optimal approach : 2 pointers
        int n = arr.length;
        int left = 0, right = 0;
        long sum =0;
        int maxLen =0;
        while(right <n){
            sum+=arr[right];
            while(left<= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen, right - left +1);
            }
            right++;
        }
        return maxLen;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k:");
        int k=sc.nextInt();
        int ans = getLongestSubarray(arr,k);
        System.out.println("Length of longest subarray with sum k is: "+ans);
        sc.close();
    }
}
