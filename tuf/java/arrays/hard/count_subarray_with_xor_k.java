import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class count_subarray_with_xor_k {
    public static int countSubarraysWithXorK(int arr[],int k){
        int n = arr.length;
        int xr =0;
        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        int cnt =0;
        for(int i=0;i<n;i++){
            xr = xr^arr[i];
            int x = xr^ k;
            if(mpp.containsKey(x)){
                cnt+=mpp.get(x);
            }
            if(mpp.containsKey(xr)){
                mpp.put(xr,mpp.get(xr)+1);
            }else{
                mpp.put(xr,1);
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value of k:");
        int k = sc.nextInt();
        int res = countSubarraysWithXorK(arr,k);
        System.out.println("Count of subarrays with XOR k is: " + res);
        sc.close();
    }
}