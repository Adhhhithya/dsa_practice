import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class leader_arr {
    public static List<Integer> leaders(List<Integer> arr){
        int n = arr.size();
        int maxi = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(arr.get(i)>maxi){
                ans.add(arr.get(i));
            }
            maxi = Math.max(maxi,arr.get(i));
        }
        // Collections.sort(ans); in sorted order of leaders
        Collections.reverse(ans); //in actual order of leaders
        return ans;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        List<Integer> ans = leaders(arr);
        System.out.println("The leaders in the array are :");
        for(int i:ans){
            System.out.print(i + " ");
        }
        sc.close();
    }

}
