import java.util.Scanner;

public class maximum_subarray_sum {
    public static long max_subarray_sum(int arr[]){
        //Optimal Approach : Kadane's Algorithm
        int n = arr.length;
        long maxi = Long.MIN_VALUE; 
        long sum = 0;

        int start = 0;
        int ansStart = -1, ansEnd = -1;
        
        for (int i = 0; i < n; i++) {
            if (sum == 0) start = i; 

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        // Handle edge case: if all elements are negative
        if (maxi < 0) {
            maxi = arr[0];
            ansStart = 0;
            ansEnd = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] > maxi) {
                    maxi = arr[i];
                    ansStart = i;
                    ansEnd = i;
                }
            }
        }

        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i]);
            if (i < ansEnd) System.out.print(", ");
        }
        System.out.println("]");

        return maxi;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){   
            arr[i] = sc.nextInt();
        }
        long result = max_subarray_sum(arr);
        System.out.println("The maximum subarray sum is: " + result);
        sc.close();
    }
}
