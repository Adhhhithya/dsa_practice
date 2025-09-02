import java.util.Scanner;

public class check_arr_sorted_rotated {
    public static boolean is_sorted_rotated(int arr[]){
        int count =0;
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                count++;
            }if(count>1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements :");
        int n = sc.nextInt();
        System.out.println("Enter the no. of array elements :");
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if (is_sorted_rotated(arr)){
            System.out.println("The array is sorted and rotated");
        }else{
            System.out.println("The array is not sorted and rotated");
        }
        sc.close();

    }
}

