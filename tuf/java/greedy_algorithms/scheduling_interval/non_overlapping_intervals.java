import java.util.*;
public class non_overlapping_intervals {
    public static int min_intervals(int[][] intervals){
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[1],b[1]));
        int cnt=1;
        int n = intervals.length;
        int last_end_time = intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]>=last_end_time){
                cnt++;
                last_end_time = intervals[i][1];
            }
        }
        return n - cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of intervals :");
        int n = sc.nextInt();
        int intervals[][] = new int[n][2];
        System.out.println("Enter the start and end time of each interval :");
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                intervals[i][j] = sc.nextInt();
            }
        }
        System.out.println("The minimum number of intervals to be removed is :");
        System.out.println(min_intervals(intervals));
        sc.close();
    }
}
