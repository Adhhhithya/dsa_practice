import java.util.HashMap;
import java.util.Scanner;
public class two_sum_type2 {
    public static int[] twoSum(int[] arr,int target){
        int n=arr.length;
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            int num = arr[i];
            int more = target - num;
            if(mpp.containsKey(more)){
                ans[0]=mpp.get(more);
                ans[1]=i;
                return ans;
            }
            mpp.put(arr[i],i);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans[] = twoSum(arr,target);
        System.out.println("The indices of the two numbers such that they add up to target are :"+ans[0]+" and "+ans[1]);
        sc.close();
    }
}
