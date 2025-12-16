import java.util.*;
public class trapping_rainwater{
    public static int trap(int[] height){
        int n = height.length;
        int lmax =0;
        int rmax=0;
        int l=0;
        int r=n-1;

        int total =0;

        while(l<r){
            if(height[l]<=height[r]){
                if(lmax>height[l]){
                    total += lmax - height[l];
                }else{
                    lmax = height[l];
                }
                l=l+1;
            }else{
                if(rmax > height[r]){
                    total += rmax - height[r];
                }else{
                    rmax = height[r];
                }
                r=r-1;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int height[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        int result = trap(height);
        System.out.println("The total trapped rainwater is: " + result);
        sc.close();
    }
}