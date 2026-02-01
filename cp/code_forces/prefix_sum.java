import java.util.*;
public class prefix_sum {
    public static long compute_value(int arr[]){
        long sum =0;
        int curr_max =0;
        for(int i=0;i<arr.length;i++){
            curr_max = Math.max(curr_max,arr[i]);
            sum+=curr_max;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of test cases : ");
        int t = sc.nextInt();
        while(t-- >0){
            System.out.println("Enter the size of the array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements of the array : ");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            long ans = compute_value(arr);
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;

                    ans = Math.max(ans,compute_value(arr));

                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
            System.out.println("The maximum prefix sum value is : " + ans);
        }
        sc.close();
    }
}
