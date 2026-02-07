import java.util.*;
public class atcoder_riko{
    private static boolean canPairAll(long[] arr, long L) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            long sum = arr[i] + arr[j];
            if (sum != L) {
                return false;
            }
            i++;
            j--;
        }
        return i > j;
    }

    private static boolean canPairWithSingles(long[] arr, long L) {
        int i = 0;
        int j = arr.length - 1;

        while (j >= 0 && arr[j] == L) {
            j--; 
        }

        while (i < j) {
            long sum = arr[i] + arr[j];
            if (sum != L) {
                return false;
            }
            i++;
            j--;
        }
        return i > j;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);
        long min = arr[0];
        long max = arr[n - 1];
        List<Long> res = new ArrayList<>();

        if (canPairWithSingles(arr, max)) {
            res.add(max);
        }

        long candidate = min + max;
        if (candidate != max && canPairAll(arr, candidate)) {
            res.add(candidate);
        }

        for(int i = 0; i < res.size(); i++){
            if(i > 0) System.out.print(" ");
            System.out.print(res.get(i));
        }
        sc.close();
    }
}
