import java.util.Scanner;
import java.util.*;
public class majority_element {
    public static int majority_element(int arr[]){
        //Optimal Approach : Moore's Voting Algorithm
        int n = arr.length;
        int count=0;
        int ele=0;
        for(int i=0;i<n;i++){
            if(count==0){
                ele=arr[i];
                count=1;
            }else if(arr[i]==ele){
                count++;
            }else{
                count--;
            }
        }
        int cnt_1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ele) cnt_1++;
        }
        if(cnt_1>n/2) return ele;
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array :");
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int ans = majority_element(arr);
        if(ans!=-1){
            System.out.println("The majority element is : "+ans);
        }else{
            System.out.println("No majority element found");
        }
        sc.close();
}
}
