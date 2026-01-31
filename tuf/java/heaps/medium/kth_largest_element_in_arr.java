import java.util.*;
public class kth_largest_element_in_arr {
    public static int find_kth_largest(int arr[],int k){
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++) pq.add(arr[i]);
        for(int i=k;i<n;i++){
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
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
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        int kth_largest = find_kth_largest(arr, k);
        System.out.println(k + "th largest element in the array is: " + kth_largest);
        sc.close();
    }
}
