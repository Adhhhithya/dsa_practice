import java.util.*;
public class n_meetings {
    static class MeetingComparator implements Comparator<int[]>{
        public int compare(int[] a , int[] b){
            return Integer.compare(a[1], b[1]);
        }

    }
    public static int max_meetings(int[] start,int[] end){
        int n = start.length;
        List<int[]> meetings = new ArrayList<>();
        for(int i=0;i<n;i++){
            meetings.add(new int[]{start[i],end[i]});
        }
        Collections.sort(meetings, new MeetingComparator());
        int cnt =1;
        int free_time = meetings.get(0)[1];

        for(int i=1;i<n;i++){
            if(meetings.get(i)[0] > free_time){
                cnt++;
                free_time = meetings.get(i)[1];
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of meetings :");
        int n = sc.nextInt();
        int start[] = new int[n];
        int end[] = new int[n];
        System.out.println("Enter the start time of each meeting :");
        for(int i=0;i<n;i++){
            start[i] = sc.nextInt();
        }
        System.out.println("Enter the end time of each meeting :");
        for(int i=0;i<n;i++){
            end[i] = sc.nextInt();
        }
        System.out.println("The maximum number of meetings that can be scheduled is :");
        System.out.println(max_meetings(start,end));
        sc.close();
    }
}
