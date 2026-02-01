import java.util.*;
public class shifted_mex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of test cases : ");
        int t = sc.nextInt();
        while(t-- >0){
            System.out.println("Enter the size of the array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements of the array : ");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int max_mex =0;
            for(int i=0;i<n;i++){
                int x = -arr[i];
                Set<Integer> shifted = new HashSet<>();
                for(int j=0;j<n;j++){
                    shifted.add(arr[j]+x);
                }
                int mex =0;
                while(shifted.contains(mex)){
                    mex++;
                }
                max_mex = Math.max(max_mex,mex);
            }
            System.out.println("The maximum shifted MEX is : " + max_mex);
        }
        sc.close();
    }
}
