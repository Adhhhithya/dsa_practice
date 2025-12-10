import java.util.*;
public class next_greatest_element_type2 {
    public static int[] nextGreatestELement(int arr[]){
        int n = arr.length;
        int nge [] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(!st.empty()&& st.peek()<=arr[i%n]){
                st.pop();
            }
            if(i<n){
                nge[i]= st.empty() ? -1 : st.peek();
            }
            st.push(arr[i%n]);
        }
        return nge;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result[] = nextGreatestELement(arr);
        System.out.println("The Next Greatest Elements are:");
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
        sc.close();
    }
}
