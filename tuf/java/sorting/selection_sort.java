import java.util.Scanner;
public class selection_sort {
    public static void selectionsort(int arr[] , int n){
        for(int i=0;i<=n-2;i++){
            int mini = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]) mini = j;
            }
            int temp = arr[mini];
            arr[mini]=arr[i];
            arr[i]= temp;
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
        selectionsort(arr, n);
        System.out.println("\nArray elements after sorting :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
