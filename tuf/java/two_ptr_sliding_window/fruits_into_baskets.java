import java.util.*;
public class fruits_into_baskets {
    public static int max_fruits(int fruits[]){
        int l=0,r=0,maxlen=0;
        int n = fruits.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();

        while(r<n){
            mpp.put(fruits[r],mpp.getOrDefault(fruits[r],0 )+1);

            if(mpp.size()>2){
                while(mpp.size()>2){
                    mpp.put(fruits[l],mpp.get(fruits[l])-1);
                    if(mpp.get(fruits[l])==0){
                        mpp.remove(fruits[l]);
                    }
                    l++;
                }
            }
            if(mpp.size()<=2){
                maxlen = Math.max(maxlen,r-l+1);
            }else{
                break;
            }
            r++;
        }
        return maxlen;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        System.out.println("Enter the arr elements :");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = max_fruits(arr);
        System.out.println("The maximum fruits that can stored in the fruit basket : "+res);
        sc.close();
    }
}
