import java.util.*;
public class task_scheduler {
    public static int remaining_time(char[] tasks , int n){
        Map<Character,Integer> freq = new HashMap<>();
        for(char task : tasks){
            freq.put(task,freq.getOrDefault(task, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int count : freq.values()){
            pq.add(count);
        }
        int time =0;

        while(!pq.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int cycle = n+1;
            int i=0;

            while(i< cycle && !pq.isEmpty()){
                int cnt = pq.poll();
                cnt--;
                if(cnt>0) temp.add(cnt);
                time++;
                i++;
            }
            for(int rem:temp){
                pq.add(rem);
            }
            if(!pq.isEmpty()){
                time += (cycle -i);
            }
        }
        return time;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of tasks: ");
        int n = sc.nextInt();
        System.out.println("Enter the tasks (as characters without spaces): ");
        String taskInput = sc.next();
        char[] tasks = taskInput.toCharArray();
        System.out.print("Enter the cooldown period: ");
        int cooldown = sc.nextInt();
        int totalTime = remaining_time(tasks, cooldown);
        System.out.println("Total time to finish all tasks: " + totalTime);
        sc.close();
    }
}
