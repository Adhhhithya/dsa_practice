import java.util.Scanner;
public class missing_number {
    public static int missingNumber(int nums[]){
        //=====================================================================================//
        // // Brute Force Approach
        // int n = nums.length;
        // for(int i=1;i<=n;i++){
        //     int flag = 0;
        //     for(int j=0;j<n-1;j++){
        //         if(nums[j]==i){
        //             flag =1;
        //             break;
        //         }
        //     }
        //     if(flag==0){
        //         return i;
        //     }
        // }
        // return -1;
        //===================================================================================//
        // // Better Approach : Hashing
        // int n = nums.length;
        // int hash []=new int[n+1];
        // for(int i=0;i<n-1;i++){
        //     hash[nums[i]]=1;
        // }
        // for(int i=1;i<=n;i++){
        //     if(hash[i]==0){
        //         return i;
        //     }
        // }
        // return -1;
        //====================================================================================//
        // //Optimal Approach 1 : Sum
        // int n = nums.length;
        // int sum = n*(n+1)/2;
        // int sum2= 0;
        // for(int i=0;i<n-1;i++){
        //     sum2+=nums[i];
        // }
        // return sum - sum2;
        //=====================================================================================//
        //Optimal Approach 2 : XOR
        int n = nums.length;
        int xor1=0;
        for(int i=0;i<=n;i++){
            xor1=xor1^i;
        }
        int xor2=0;
        for(int i=0;i<n-1;i++){
            xor2=xor2^nums[i];
        }
        return xor1^xor2;
        //=====================================================================================//
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        int missing = missingNumber(arr);
        System.out.println("The missing number is: "+missing);
        sc.close();
    }
    
}
