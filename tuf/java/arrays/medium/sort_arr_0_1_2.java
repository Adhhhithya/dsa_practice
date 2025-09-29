
import java.util.Scanner;


public class sort_arr_0_1_2 {
    public static void sortArr(int[] arr){
        int n =arr.length;
        // Better Approach : Couting Method
        // int cnt_0=0,cnt_1=0,cnt_2=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==0) cnt_0++;
        //     else if(arr[i]==1) cnt_1++;
        //     else cnt_2++;
        // }
        // for(int i=0;i<cnt_0;i++) arr[i]=0;
        // for(int i=cnt_0;i<cnt_0+cnt_1;i++)arr[i]=1;
        // for(int i=cnt_0+cnt_1;i<n;i++)arr[i]=2;
        //============================================================================//
        // Optimal Approach : Dutch National Flag Algorithm
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
     }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sortArr(arr);
        System.out.println("The sorted array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
