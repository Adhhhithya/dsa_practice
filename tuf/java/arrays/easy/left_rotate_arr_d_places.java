import java.util.Scanner;

public class left_rotate_arr_d_places {
         public static void reverse(int arr[], int start, int end) {
            while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
        public static void left_rotate(int arr[], int n, int d) {
        d = d % n;  // handle cases where d > n
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

        //brute force 
        // d = d % n;  
        // int[] temp = new int[d];
        
        
        // for(int i = 0; i < d; i++) {
        //     temp[i] = arr[i];
        // }
        
        
        // for(int i = d; i < n; i++) {
        //     arr[i-d] = arr[i];
        // }
        
      
        // for(int i = n-d; i < n; i++) {
        //     arr[i] = temp[i-(n-d)];
        // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the no. of left rotations: ");
        int d = sc.nextInt();
        
        left_rotate(arr, n, d);
        System.out.println("The array after " + d + " left rotations is:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}