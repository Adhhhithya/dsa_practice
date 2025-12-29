import java.util.*;
public class largest_rectangle_in_histogram {
    public static int max_area_rectangle(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&& arr[st.peek()]>arr[i]){
                int el = st.peek();
                st.pop();
                int nse = i;
                int pse = st.isEmpty()?-1:st.peek();
                maxArea = Math.max(maxArea,arr[el]*(nse-pse-1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int nse = n;
            int el = st.peek();
            st.pop();
            int pse = st.isEmpty()?-1:st.peek();
            maxArea = Math.max(maxArea,arr[el]*(nse-pse-1));
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Histogram : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the heights of Histogram :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum Area of the Rectangle in the Histogram : "+max_area_rectangle(arr));
        sc.close();
    }
}
