import java.util.*;
public class replace_elements_with_rank {
    public static List<Integer> replace_rank(List<Integer> arr){
        //Brute force
        // List<Integer> sorted_arr = new ArrayList<>(arr);
        // Collections.sort(sorted_arr);

        // HashMap<Integer,Integer> rank_map = new HashMap<>();
        // int rank =1;
        // for(int num : sorted_arr){
        //     if(!rank_map.containsKey(num)){
        //         rank_map.put(num,rank);
        //         rank++;
        //     }
        // }
        // List<Integer> result = new ArrayList<>();
        // for(int num: arr){
        //     result.add(rank_map.get(num));
        // }
        // return result;

        //Optimal
        List<Integer> sorted_arr = new ArrayList<>(arr);
        Collections.sort(sorted_arr);
        Map<Integer, Integer> rank_map = new HashMap<>();
        int rank = 1;
        for (int num : sorted_arr) {
            if (!rank_map.containsKey(num)) {
                rank_map.put(num, rank);
                rank++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add(rank_map.get(num));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        List<Integer> ranked_arr = replace_rank(arr);
        System.out.println("Array with elements replaced by their ranks:");
        for(int rank : ranked_arr){
            System.out.print(rank + " ");
        }
        sc.close();

    }
}
