import java.util.Scanner;
public class largest_element {
    public static int largest(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of array elements :");
        int n = sc.nextInt();
        System.out.println("Enter the array elements :");
        int arr[] = new int[n];
        for(int i =0;i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Largest Element in the array : "+largest(arr));
        sc.close();
    }
    
}
