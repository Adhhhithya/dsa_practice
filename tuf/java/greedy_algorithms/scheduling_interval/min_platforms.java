import java.util.*;
public class min_platforms {
    public static int find_min_platforms(int arr[],int dep[]){
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int cnt = 1;
        int max_cnt =1;
        int i=1,j=0;

        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                cnt++;
                i++;
            }else{
                cnt--;
                j++;
            }
            max_cnt = Math.max(max_cnt, cnt);
        }
        return max_cnt;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of trains: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int dep[] = new int[n];
        System.out.println("Enter the arrival and departure times of the trains: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            dep[i] = sc.nextInt();
        }
        System.out.println("The minimum no. of platforms required : "+find_min_platforms(arr, dep));
        sc.close();
    }
}
