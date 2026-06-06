import java.util.*;
public class work_allocate_sum {
    public static int max_profit(int jobs[][]){
        int n = jobs.length;
        Arrays.sort(jobs,(a,b)-> b[1]-a[1]);
        int max_deadline = jobs[0][0];
        for(int i=1;i<n;i++){
            max_deadline = Math.max(max_deadline,jobs[i][0]);
        }
        boolean pos[] = new boolean[max_deadline+1];
        int total_profit =0;

        for(int i=0;i<n;i++){
            for(int j=jobs[i][0];j>0;j--){
                if(pos[j]==false){
                    pos[j] =true;
                    total_profit += jobs[i][1];
                    break;
                }
            }
        }
        return total_profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of jobs :");
        int n = sc.nextInt();
        int jobs[][] = new int[n][2];
        System.out.println("Enter the deadline and profit of each job :");
        for(int i=0;i<n;i++){
            jobs[i][0] = sc.nextInt();
            jobs[i][1] = sc.nextInt();
        }
        System.out.println("Maximum profit that can be earned :");
        System.out.println(max_profit(jobs));
        sc.close();
    }
}
