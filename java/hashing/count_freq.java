import java.util.Scanner;
import java.util.*;
public class count_freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Frequency(arr, n);
        sc.close();
    }

    // Brute Force Approach
    // public static void countFreq(int arr[], int n) {
    //     boolean visited[] = new boolean[n];

    //     for (int i = 0; i < n; i++) {
    //         if (visited[i] == true) 
    //             continue;

    //         int count = 1; 

    //         for (int j = i + 1; j < n; j++) { 
    //             if (arr[i] == arr[j]) {
    //                 visited[j] = true;
    //                 count++;
    //             }
    //         }
    //         System.out.println(arr[i] + " occurs " + count + " time(s)");
    //     }
    // }

    // Using Map 
    public static void Frequency(int arr[],int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" occurs "+entry.getValue()+" time(s)");
        }
    }
}
