import java.util.*;
public class sum_of_subarray_minimums {
    private int[] find_NSE(int arr[]){
        int n = arr.length;
        int nse[] =  new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            // Maintain strictly smaller on the right to avoid double counting equal elements
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }

    private int[] find_PSE(int arr[]){
        int n = arr.length;
        int pse[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            // Maintain smaller-or-equal on the left to pair with strict right check
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }
    
    public int sum_subarray_minimums(int arr[]){
        int n = arr.length;
        int mod = (int)(1e9 + 7);
        int nse[] = find_NSE(arr);
        int pse[] = find_PSE(arr);
        long sum =0;
        for(int i=0;i<n;i++){
            int  left = i - pse[i];
            int right = nse[i] - i;
            long freq = left * right * 1L;
            int val = (int)((freq * arr[i] )%mod);
            sum = (sum + val) % mod;
        }
        return (int)sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sum_of_subarray_minimums obj = new sum_of_subarray_minimums();
        int result = obj.sum_subarray_minimums(arr);
        System.out.println("The sum of subarray minimums is: " + result);
        sc.close();
    }
}
