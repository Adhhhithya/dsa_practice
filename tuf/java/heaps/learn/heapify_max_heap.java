import java.util.Scanner;
public class heapify_max_heap {
    public static void heapify(int[] arr, int ind , int val){
        if(arr[ind]<val){
            arr[ind] = val;
            heapify_up(arr,ind);
        }else{
            arr[ind]=val;
            heapify_down(arr,ind);
        }
    }
    private static void heapify_down(int arr[],int ind){
        int largest = ind;
        int l_child = 2*ind +1;
        int r_child = 2*ind+2;

        if(l_child < arr.length && arr[l_child]> arr[largest]){
            largest=l_child;
        }
        if(r_child < arr.length && arr[r_child]>arr[largest]){
            largest=r_child;
        }
        if(largest !=ind){
            int temp = arr[ind];
            arr[ind]=arr[largest];
            arr[largest]=temp;
            heapify_down(arr, largest);
        }
    }

    private static void heapify_up(int[] arr,int ind){
        int parent = (ind-1)/2;
        if(ind > 0){
            if(arr[ind]>arr[parent]){
                int temp = arr[ind];
                arr[ind]=arr[parent];
                arr[parent]=temp;
                heapify_up(arr, parent);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the heap:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the heap:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index and value to be heapified:");
        int ind = sc.nextInt();
        int val = sc.nextInt();
        heapify(arr, ind, val);
        System.out.println("Heap after heapify:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
