import java.util.Scanner;

public class remove_dups_sorted_arr {
    public static int remove_duplicates(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int new_size = remove_duplicates(arr, n);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < new_size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}