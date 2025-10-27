import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class count_subarray_sum {
    public static long findAllSubarraysWithGivenSum(int arr[], int k) {
        int n = arr.length; // size of the given array.
        Map<Long, Integer> mpp = new HashMap<>();
        long preSum = 0L;
        long cnt = 0L;

        mpp.put(0L, 1); // Setting 0 in the map.
        for (int i = 0; i < n; i++) {
            // add current element to prefix Sum:
            preSum += arr[i];

            // Calculate preSum - k:
            long remove = preSum - k;

            // Add the number of subarrays with required sum:
            cnt += mpp.getOrDefault(remove, 0);

            // Update the count of this prefix sum in the map.
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum k: ");
        int k = sc.nextInt();
        long result = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("Number of subarrays with sum " + k + " is: " + result);
        sc.close();
    }
}
