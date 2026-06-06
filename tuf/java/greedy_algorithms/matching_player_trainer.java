import java.util.*;
public class matching_player_trainer {
    public static int maximum_match(int[] players,int[] trainers){
        int m = players.length;
        int n = trainers.length;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int l=0,r=0;

        while(l<n && r<m){
            if(players[r] <= trainers[l]){
                r++;
            }
            l++;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players :");
        int m = sc.nextInt();
        int players[] = new int[m];
        System.out.println("Enter the skill level of each player :");
        for(int i=0;i<m;i++){
            players[i] = sc.nextInt();
        }
        System.out.println("Enter the number of trainers :");
        int n = sc.nextInt();
        int trainers[] = new int[n];
        System.out.println("Enter the training capacity of each trainer :");
        for(int i=0;i<n;i++){
            trainers[i] = sc.nextInt();
        }
        System.out.println("The maximum number of players that can be matched with trainers is :");
        System.out.println(maximum_match(players,trainers));
        sc.close();
    }
}
