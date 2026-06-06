import java.util.*;
public class queue_reconstruction {
    public static int[][] reconstruct_queue(int people[][]){
        Scanner sc = new Scanner(System.in);
        int n = people.length;
        Arrays.sort(people,(a,b) -> {
            if(a[0]==b[0])
                return a[1]-b[1];
            return b[0]-a[0];
        });
        List<int[]> res = new ArrayList<>();

        for(int a[]:people){
            res.add(a[1],a);
        }

        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people :");
        int n = sc.nextInt();
        int people[][] = new int[n][2];
        System.out.println("Enter the height and the number of people in front of each person :");
        for(int i=0;i<n;i++){
            people[i][0] = sc.nextInt();
            people[i][1] = sc.nextInt();
        }
        System.out.println("The reconstructed queue is :");
        int res[][] = reconstruct_queue(people);
        for(int i=0;i<n;i++){
            System.out.println(res[i][0]+" "+res[i][1]);
        }
        sc.close();
    }
}
