import java.util.Scanner;

public class recursive_insertion_sort {
    public static void insertion_sort(int [] arr , int i , int n){
        if(i==n) return;
        int j = i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
        insertion_sort(arr, i+1,n);
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
        insertion_sort(arr,0,n);
        System.out.println("\nArray elements after sorting :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
 
