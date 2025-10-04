import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class next_permutation {
    public static List<Integer> next_greater_permutation(List<Integer> A){
        int ind=-1;
        int n = A.size();
        // Step 1 : Longer Prefix Match
        for(int i=n-2;i>=0;i--){
            if(A.get(i)<A.get(i+1)){
                ind =i;
                break;
            }
        }
        if(ind==-1){
            Collections.reverse(A);
            return A;
        }
        // Step 2 : Find the just greater element
        for(int i=n-1;i>ind;i--){
            if(A.get(i)>A.get(ind)){
                int temp = A.get(i);
                A.set(i,A.get(ind));
                A.set(ind,temp);
                break;
            }
        }
        // Step 3 : Reverse the remaining elements in sorted order
        List<Integer> sublist = A.subList(ind+1, n);
        Collections.reverse(sublist);
        return A;


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
        List<Integer> ans = next_greater_permutation(arr);
        System.out.println("The next permutation is:"); 
        for(int i : ans){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
