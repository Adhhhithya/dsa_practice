import java.util.*;
public class count_nge_right {
    public static int[] nextGreaterElement(int arr[]){
        int n = arr.length;
        int result[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            while(!st.empty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.empty()){
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }
            
            st.push(arr[i]);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int result[] = nextGreaterElement(arr);
        System.out.println("Next Greater Element for each element:");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
