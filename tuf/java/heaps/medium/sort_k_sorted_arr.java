import java.util.*;
public class sort_k_sorted_arr {
    public static ArrayList<Integer> sortKsortedArrr(int arr[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<=k && i<n;i++){
            pq.add(arr[i]);
        }
        for(int i=k+1;i<n;i++){
            res.add(pq.poll());
            pq.add(arr[i]);
        }
        while(!pq.isEmpty()){
            res.add(pq.poll());
        }
        return res;
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
        ArrayList<Integer> sortedArr = sortKsortedArrr(arr, k);
        System.out.println("The sorted array is: " + sortedArr);
        sc.close();
    }
}
