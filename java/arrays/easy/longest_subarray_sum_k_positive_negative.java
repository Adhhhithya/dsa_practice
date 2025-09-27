import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class longest_subarray_sum_k_positive_negative {
    public static int getLongestSubarray(int arr[],int k){
        int n = arr.length;
        Map<Integer,Integer> preSumMap = new HashMap<>();
        long sum =0;
        int maxLen=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum ==k){
                maxLen = Math.max(maxLen,i+1);
            }
            int rem = (int)(sum -k);
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            if(!preSumMap.containsKey(sum)){
                preSumMap.put((int)sum,i);
            }
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
