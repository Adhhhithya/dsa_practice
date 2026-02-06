import java.util.*;
public class connect_n_ropes {
    public static int min_cost_to_connect(int [] sticks){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int stick : sticks){
            pq.add(stick);
        }
        int total_cost =0;

        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            int cost = a+b;
            total_cost+=cost;
            pq.add(cost);
        }
        return total_cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of ropes: ");
        int n = sc.nextInt();
        int[] sticks = new int[n];
        System.out.println("Enter the lengths of the ropes: ");
        for(int i=0;i<n;i++){
            sticks[i] = sc.nextInt();
        }
        int result = min_cost_to_connect(sticks);
        System.out.println("Minimum cost to connect all ropes: " + result);
        sc.close();  
  }
}
