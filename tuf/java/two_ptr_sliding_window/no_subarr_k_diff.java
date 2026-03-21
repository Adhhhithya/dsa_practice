import java.util.*;
public class no_subarr_k_diff {
    private static int atMost(int arr[],int k){
        int l=0,r=0,cnt=0;
        int n = arr.length;
        Map<Integer,Integer> mpp = new HashMap<>();

        while(r<n){
            mpp.put(arr[r],mpp.getOrDefault(arr[r],0 )+1);

            while( mpp.size()>k){
                mpp.put(arr[l],mpp.get(arr[l])-1);
                if(mpp.get(arr[l])==0){
                    mpp.remove(arr[l]);
                }
                l++;
            }
            cnt += (r-l+1);
            r++;
        }
        return cnt;
    }
    public static int no_subarr_with_k_diff(int nums[],int k){
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
        System.out.println("The number of subarrays with k different integers is :");
        System.out.println(no_subarr_with_k_diff(arr,goal));
        sc.close();
    }
}
