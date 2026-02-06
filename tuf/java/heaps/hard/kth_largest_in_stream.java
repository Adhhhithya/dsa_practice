import java.util.*;
public class kth_largest_in_stream {
    private int k;
    private PriorityQueue<Integer> pq;
    public kth_largest_in_stream(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
        }
    }
    public int add(int val){
        pq.add(val);

        while(pq.size()>k){
            pq.poll();        
    }
        return pq.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.print("Enter the number of initial elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the initial elements: ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        kth_largest_in_stream kthLargest = new kth_largest_in_stream(k, nums);
        System.out.print("Enter the number of new elements to add: ");
        int m = sc.nextInt();
        System.out.println("Enter the new elements: ");
        for(int i=0;i<m;i++){
            int val = sc.nextInt();
            int kthLargestVal = kthLargest.add(val);
            System.out.println("Current " + k + "-th largest element: " + kthLargestVal);
        }
        sc.close();
    }
 }
