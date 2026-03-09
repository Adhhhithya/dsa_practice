import java.util.*;
public class chmin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]<x){
                x = arr[i];
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
        sc.close();
    }
}
