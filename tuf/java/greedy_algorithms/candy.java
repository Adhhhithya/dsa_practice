import java.util.*;
public class candy {
    public static int min_candy(int ratings[]){
        int n = ratings.length;
        int candy[] = new int[n];
        Arrays.fill(candy,1);

        //left to right
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                candy[i] = candy[i-1] +1;
            }
        }

        //right to left
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                candy[i] = Math.max(candy[i],candy[i+1]+1);
            }
        }

        return Arrays.stream(candy).sum();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of children :");
        int n = sc.nextInt();
        int ratings[] = new int[n];
        System.out.println("Enter the ratings of each child :");
        for(int i=0;i<n;i++){
            ratings[i] = sc.nextInt();
        }
        System.out.println("Minimum number of candies required :");
        System.out.println(min_candy(ratings));
        sc.close();
    }
}
