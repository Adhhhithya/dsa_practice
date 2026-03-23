import java.util.*;
public class jump_game_type1 {
    public static boolean can_jump(int arr[]){
        int maxInd =0;
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(i>maxInd) return false;
            maxInd = Math.max(maxInd,i+arr[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Can we jump to the end of the array ? :");
        System.out.println(can_jump(arr));
        sc.close();   
    }
}
