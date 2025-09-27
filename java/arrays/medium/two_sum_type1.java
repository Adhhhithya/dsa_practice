import java.util.*;
import java.util.HashMap;
public class two_sum_type1 {  
    public static String twoSum(int arr[], int target) {  
        int n = arr.length;
        //Brute force approach : Nested For loop
        // for(int i = 0; i < n; i++) {
        //     for(int j = i + 1; j < n; j++) {  
        //         if(arr[i] + arr[j] == target) {
        //             return "YES, Two Sum exists!";
        //         }
        //     }
        // }
        // return "NO, Two Sum doesn't exist!"; 
        //===========================================================//
        //Better approach : Hashing
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < n; i++) {
        //     int num = arr[i];
        //     int more = target - num;
        //     if(map.containsKey(more)){
        //         return "YES, Two Sum exists!";
        //     }
        //     map.put(arr[i],i);
        // }
        // return "NO, Two Sum doesn't exist!";
        //===========================================================//
        //Optimal approach : Sorting + 2 pointers
        Arrays.sort(arr);
        int left =0,right = n-1;
        while(left <right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                return "YES, Two Sum exists!";
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return "NO, Two Sum doesn't exist!";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        
        String result = twoSum(arr, target);
        System.out.println(result);
        
        sc.close();
    }
}
