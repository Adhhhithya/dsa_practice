import java.util.*;
public class recursive_bubble_sort {
    public static void bubble_sort(int[] arr,int n){
        if(n==1) return ;
        int didSwap = 0;
        for(int j = 0 ; j<=n-2;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                didSwap = 1 ;
            }
        }
        if(didSwap == 0) return ;
        bubble_sort(arr,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements before sorting :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        bubble_sort(arr, n);
        System.out.println("\nArray elements after sorting :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
