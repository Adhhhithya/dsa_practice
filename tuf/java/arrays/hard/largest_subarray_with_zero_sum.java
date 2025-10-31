import java.util.HashMap;
import java.util.Scanner;
public class largest_subarray_with_zero_sum {
    public static int subarray_sum(int [] arr){
        int n = arr.length;
        int maxi =0;
        int sum=0;
        HashMap<Integer,Integer> mpp = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum==0){
                maxi = i+1;
            }else{
                if(mpp.get(sum)!=null){
                    maxi = Math.max(maxi,i-mpp.get(sum));
                }else{
                    mpp.put(sum,i);
                }
            }
        }
        return maxi;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = subarray_sum(arr);
        System.out.println("Length of largest subarray with sum 0 is: " + res);
        sc.close();
    }
}
