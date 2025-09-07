import java.util.Scanner;
public class move_zeros_end {
    public static void movezerostoend(int arr[],int n){
        //brute force 
        // int [] temp = new int[n];
        // int idx=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]!=0){
        //         temp[idx]=arr[i];
        //         idx++;
        //     }
        // }
        // for(int i=0;i<temp.length;i++){
        //     arr[i]=temp[i];
        // }
        // int non_zero = temp.length;
        // for(int i=non_zero;i<n;i++){
        //     arr[i]=0;
        // }
        // optimal ( 2 pointer approach)
        int j = 0; 
        while(j < n && arr[j] != 0) {
            j++;
        }
        if(j >= n) return;
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                j++;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        movezerostoend(arr, n);
        System.out.println("The array after moving zeros to the end is:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
