import java.util.*;
public class next_greatest_element_type1 {
    public static int[] nextGreatestElement(int arr[]){
        int n=arr.length;
        int nge [] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.empty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.empty()){
                nge[i]=-1;
            }else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
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
        int result[] = nextGreatestElement(arr);
        System.out.println("The Next Greatest Elements are:");
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
        sc.close();
}
}
