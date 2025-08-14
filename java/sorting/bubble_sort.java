import java.util.Scanner;

public abstract class bubble_sort {
    public static void bubblesort(int arr[],int n){
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
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
        bubblesort(arr, n);
        System.out.println("\nArray elements after sorting :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
