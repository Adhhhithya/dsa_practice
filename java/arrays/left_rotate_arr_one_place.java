import java.util.Scanner;
public class left_rotate_arr_one_place {
    public static void left_rotate(int arr[],int n){
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        left_rotate(arr,n);
        System.out.println("Array after left rotation by one place :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
