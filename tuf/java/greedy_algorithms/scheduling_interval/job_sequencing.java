import java.util.*;
public class job_sequencing {
    public static int max_profit(int jobs[][]){
        Arrays.sort(jobs,(a,b)->b[2]-a[2]);
        int max_deadline = -1;
        int n = jobs.length;

        for(int[] it : jobs){
            max_deadline = Math.max(max_deadline,it[1]);
        }
        int hash[] = new int[max_deadline+1];
        Arrays.fill(hash,-1);
        int cnt=0,total_profit =0;

        for(int i=0;i<n;i++){
            for(int j=jobs[i][1]-1;j>=0;j--){
                if(hash[j]==-1){
                    cnt++;
                    total_profit += jobs[i][2];
                    hash[j]= jobs[i][0];
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
        int jobs[][] = new int[n][3];
        System.out.println("Enter the job id, deadline and profit of each job :");
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                jobs[i][j] = sc.nextInt();
            }
        }
        System.out.println("The maximum profit is :");
        System.out.println(max_profit(jobs));
        sc.close();
    }
}
