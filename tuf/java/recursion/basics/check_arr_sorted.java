
import java.util.ArrayList;
import java.util.Scanner;

public class check_arr_sorted {
    public static boolean is_sorted(ArrayList<Integer> arr){
        return check_sorted(arr,1);
    }
    private static boolean check_sorted(ArrayList<Integer> arr,int i){
        if(i>=arr.size()) return true;
        if(arr.get(i)<arr.get(i-1)) return false;
        return check_sorted(arr, i+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Is the array sorted? "+is_sorted(arr));
        sc.close();
    }
}
