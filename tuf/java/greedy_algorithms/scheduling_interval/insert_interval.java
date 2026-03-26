import java.util.*;
public class insert_interval {
    public static int[][] insert(int[][] intervals,int[] new_interval){
        List<int[]> res = new ArrayList<>();
        int i=0;
        int n = intervals.length;

        while(i<n && intervals[i][1] < new_interval[0]){
            res.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0] <= new_interval[1]){
            new_interval[0] = Math.min(new_interval[0],intervals[i][0]);
            new_interval[1] = Math.max(new_interval[1],intervals[i][1]);
            i++;
        }
        res.add(new_interval);

        while(i<n){
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[res.size()][]);
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
        System.out.println("Enter the start and end time of the new interval :");
        int new_interval[] = new int[2];
        for(int i=0;i<2;i++){
            new_interval[i] = sc.nextInt();
        }
        System.out.println("The intervals after inserting the new interval are :");
        int res[][] = insert(intervals,new_interval);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i][0]+" "+res[i][1]);
        }
        sc.close();
    }
}