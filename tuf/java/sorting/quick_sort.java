package sorting;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class quick_sort {
    public static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low + 1;  
        int j = high;

        while (i <= j) { 
            while (i <= high && arr.get(i) <= pivot) {  
                i++;
            }

            while (j >= low && arr.get(j) > pivot) { 
                j--;
            }
            
            if (i < j) {  
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }
    public static void quicksort(List<Integer> arr, int low, int high) {
        if (low < high) {
            int p_index = partition(arr, low, high);
            quicksort(arr, low, p_index - 1);
            quicksort(arr, p_index + 1, high);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>(n);
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        quicksort(arr, 0, n - 1);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        sc.close();
    }
}
