import java.util.*;
public class festival_stage_performance {
    public static int max_performance(int perf[][]){
        int n = perf.length;
        Arrays.sort(perf,(a,b)-> a[1]-b[1]);
        int cnt =1;
        int start = 1;
        int end =0;

        while(start<n){
            if(perf[start][0]>=perf[end][1]){
                cnt++;
                end = start;
                start++;
            }else{
                start++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of performances :");
        int n = sc.nextInt();
        int perf[][] = new int[n][2];
        System.out.println("Enter the start and end time of each performance :");
        for(int i=0;i<n;i++){
            perf[i][0] = sc.nextInt();
            perf[i][1] = sc.nextInt();
        }
        System.out.println("Maximum number of performances that can be attended :");
        System.out.println(max_performance(perf));
        sc.close();
    }
}
