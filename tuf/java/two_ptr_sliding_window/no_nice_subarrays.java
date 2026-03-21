import java.util.*;
public class no_nice_subarrays{
    private static int atMost(int arr[],int k){
        int l =0,r=0,cnt=0,sum=0;
        int n = arr.length;

        while(r<n){
            sum += (arr[r]%2);
            while(sum>k){
                sum -= (arr[l]%2);
                l++;
            }
            cnt += (r-l+1);
            r++;
        }
        return cnt;
    }
    public static int no_of_nice_subarrays(int nums[],int k){
        return atMost(nums,k) - atMost(nums,k-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the goal :");
        int goal = sc.nextInt();
        System.out.println("The number of nice subarrays is :");
        System.out.println(no_of_nice_subarrays(arr,goal));
        sc.close();
    }
}