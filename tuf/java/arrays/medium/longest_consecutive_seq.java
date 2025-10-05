import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class longest_consecutive_seq {
    public static int longestConsecutive(int[] nums) {
        // Better Approach
        // int n = nums.length;
        // int cnt = 0;
        // int longest =0;
        // int last_smaller = Integer.MIN_VALUE;
        // Arrays.sort(nums);
        // for(int i=0;i<n;i++){
        //     if(nums[i]-1 == last_smaller){
        //         cnt = cnt+1;
        //         last_smaller= nums[i];
        //     }else if(nums[i] != last_smaller){
        //         cnt=1;
        //         last_smaller = nums[i];
        //     }
        //     longest = Math.max(longest,cnt);
        // }
        // return longest;
        //============================================================================//
        // Optimal Approach : Using Set
        int n = nums.length;
        if(n==0) return 0;
        int longest =0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int it:set){
            if(!set.contains(it-1)){
                int cnt =1;
                int x = it;
                while(set.contains(x+1)){
                    x=x+1;
                    cnt=cnt+1;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int longest = longestConsecutive(arr);
        System.out.println("The length of the longest consecutive sequence is: " + longest);
        sc.close();
    }
}
