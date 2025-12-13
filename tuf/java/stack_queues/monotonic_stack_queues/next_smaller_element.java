import java.util.*;
public class next_smaller_element {
    public static int[] nextSmallestElement(int arr[]){
        int n = arr.length;
        int nse[] = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(nse,-1);
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(!st.empty()){
                nse[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return nse;
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
        int result[] = nextSmallestElement(arr);
        System.out.println("The Next Smallest Elements are:");
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
        sc.close();
    }
}
