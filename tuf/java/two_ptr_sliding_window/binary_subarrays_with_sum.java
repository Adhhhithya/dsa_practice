import java.util.*;
public class binary_subarrays_with_sum {
    private static int sub_arr_less(int arr[],int goal){
        if(goal<0) return 0;
        int l=0,r=0,cnt=0,sum=0;
        int n = arr.length;

        while(r<n){
            sum += arr[r];
            while(sum > goal){
                sum -= arr[l];
                l++;
            }
            cnt += (r-l+1);
            r++;
        }
        return cnt;
    }
    public static int no_of_subarrays(int arr[],int goal){
        return sub_arr_less(arr,goal) - sub_arr_less(arr,goal-1);
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
        System.out.println("The number of subarrays with sum equal to goal is :");
        System.out.println(no_of_subarrays(arr,goal));
        sc.close();
    }   
    
}
