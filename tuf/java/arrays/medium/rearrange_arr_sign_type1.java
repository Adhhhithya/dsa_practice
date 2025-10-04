import java.util.Scanner;
public class rearrange_arr_sign_type1 {
    public static int[] rearrange(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int pos=0,neg=1;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                ans[neg]=arr[i];
                neg+=2;
            }else{
                ans[pos]=arr[i];
                pos+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[] = rearrange(arr);
        System.out.println("The rearranged array is:");
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }   
        sc.close();
    }
}
