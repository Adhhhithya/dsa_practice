import java.util.Scanner;

public class max_consecutive_ones {
    public static int find_max_consecutive_ones(int nums[]){
        int count =0;
        int maxi =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxi = Math.max(maxi,count);
            }else{
                count =0;
            }
        }
        return maxi;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = find_max_consecutive_ones(arr);
        System.out.println("Maximum consecutive 1's are: "+result);
        sc.close();
    
    }
}
