import java.util.Scanner;

public abstract class insertion_sort {
    public static void insertionsort(int arr[],int n){
        for(int i=0;i<=n-1;i++){
            int j =i;
            while(j>0 && arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                    j--;
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
        insertionsort(arr, n);
        System.out.println("\nArray elements after sorting :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}