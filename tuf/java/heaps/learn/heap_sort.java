import java.util.*;
public class heap_sort {
    public static void heapSort(int arr[]){
        build_max_heap(arr);
        int last = arr.length-1;
        while(last>0){
            int temp = arr[0];
            arr[0]=arr[last];
            arr[last]=temp;
            last--;
            if(last>0){
                heapify(arr,last,0);
            }
        }
    }
    private static void build_max_heap(int arr[]){
        int n =arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify_down(arr,i);
        }
    }
    private static void heapify_down(int arr[],int ind){
        int n = arr.length;
        int largest = ind;
        int l_child = 2*ind +1;
        int r_child = 2*ind +2;
        if(l_child < n && arr[l_child]>arr[largest]){
            largest=l_child;
        }
        if(r_child < n && arr[r_child]>arr[largest]){
            largest=r_child;
        }
        if(largest!=ind){
            int temp = arr[ind];
            arr[ind]=arr[largest];
            arr[largest]=temp;
            heapify_down(arr, largest);
        }
    } 
    private static void heapify(int arr[],int last, int ind){
        int largest = ind;
        int l_child = 2*ind +1;
        int r_child = 2*ind +2;
        if(l_child <=last && arr[l_child]>arr[largest]){
            largest=l_child;
        }
        if(r_child <=last && arr[r_child]>arr[largest]){
            largest=r_child;
        }
        if(largest!=ind){
            int temp =arr[ind];
            arr[ind]=arr[largest];
            arr[largest]=temp;
            heapify(arr, last, largest);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        heapSort(arr);
        System.out.println("The Sorted array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
