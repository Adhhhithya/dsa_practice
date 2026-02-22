import java.util.*;
public class sum_of_arr {
    public static int sum(int i,int[] arr){
        if(i>=arr.length)return 0;
        return arr[i]+sum(i+1,arr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum of elements in array is "+sum(0,arr));
        sc.close();
    }
}
