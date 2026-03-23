import java.util.*;
public class shortest_job_first {
    public static long min_avg_wait_time(int bt[]){
        Arrays.sort(bt);
        long t=0,wt=0;
        int n=bt.length;

        for(int i=0;i<n;i++){
            wt+=t;
            t+=bt[i];
        }
        return wt/n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of processes :");
        int n = sc.nextInt();
        int bt[] = new int[n];
        System.out.println("Enter the burst time of each process :");
        for(int i=0;i<n;i++){
            bt[i] = sc.nextInt();
        }
        System.out.println("The minimum average waiting time is :");
        System.out.println(min_avg_wait_time(bt));
        sc.close();
    }
}
