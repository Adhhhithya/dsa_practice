import java.util.*;
public class max_consecutive_ones {
    public static int max_ones(int arr[],int k){
        int l =0,r=0,maxlen=0,zeros=0;
        int n = arr.length;

        while(r<n){
            if(arr[r]==0){
                zeros++;
            }
            while(zeros>k){
                if(arr[l]==0){
                    zeros--;
                }
                l++;
            }
            if(zeros<=k){
                maxlen = Math.max(maxlen,r-l+1);
            }else{
                break;
            }
            r++;
        }
        return maxlen;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        int ans = max_ones(arr,k);
        System.out.println("Maximum number of consecutive 1's with at most "+k+" zero(s): "+ans);
        sc.close();
    }
}
