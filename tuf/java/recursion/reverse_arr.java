import java.util.Scanner;
public class reverse_arr {
    static void print_array(int ans[],int n){
        System.out.print("Reversed Array is :");
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    static void reverse_array(int arr[], int n){
        int [] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            ans[n-i-1]=arr[i];
        }
        print_array(ans, n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse_array(arr, n);

    }
}
