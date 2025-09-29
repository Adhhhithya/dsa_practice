import java.util.Scanner;
public class second_largest_smallest {
    public static int second_largest(int arr[],int n){
        int largest = arr[0];
        int sec_largest = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                sec_largest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i]>sec_largest){
                sec_largest=arr[i];
            }
        }
        return sec_largest;
    }
    public static int second_smallest(int arr[], int n){
        int smallest = arr[0];
        int second_smallest = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                second_smallest = smallest;
                smallest = arr[i];
            }else if(arr[i]!=smallest && arr[i]<second_smallest){
                second_smallest=arr[i];
            }
        }
        return second_smallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of array elements :");
        int n = sc.nextInt();
        System.out.print("Enter the array elements :");
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The Second Largest Element is "+second_largest(arr, n));
        System.out.println("The Second Smallest Element is "+second_smallest(arr, n));
        sc.close();
    }

    
}
