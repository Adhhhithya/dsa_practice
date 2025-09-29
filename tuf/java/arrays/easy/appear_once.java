import java.util.Scanner;
public class appear_once {
    public static int find_num_appear_once(int nums[]){
        //=====================================================================================//
        // // Brute Force Approach
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     int flag =0;
        //     for(int j=0;j<n;j++){
        //         if(i!=j && nums[i]==nums[j]){
        //             flag=1;
        //             break;
        //         }
        //     }
        //     if(flag==0){
        //         return nums[i];
        //     }
        // }
        // return -1;
        //===================================================================================//
        // // Better Approach : Hashing
        int n = nums.length;
        int hash[]=new int[100000];
        for(int i=0;i<n;i++){
            hash[nums[i]]++;
        }
        for(int i=0;i<n;i++){
            if(hash[nums[i]]==1){
                return nums[i];
            }
        }
        return -1;
        //====================================================================================//
        //Optimal Approach : XOR
        // int n = nums.length;
        // int xorr=0;
        // for(int i=0;i<n;i++){
        //     xorr=xorr^nums[i];
        // }   
        // return xorr;
        //=====================================================================================//
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = find_num_appear_once(arr);
        System.out.println("The element that appears once is: "+result);
        sc.close();
    
    }


}
