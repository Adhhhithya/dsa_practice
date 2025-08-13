import java.util.*;
public class high_low_freq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements in the array :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Frequency(arr,n);
    }
    public static void Frequency(int arr[], int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int maxFreq = 0 , minFreq = n;
        int maxEle =0 , minEle =0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();
            if(count>maxFreq){
                maxEle = element;
                maxFreq = count;
            }if(count < minFreq){
                minEle=element;
                minFreq=count;
            }
        }
        System.out.println("The highest frequency element is : "+maxEle+" with Frequency "+maxFreq);
        System.out.println("The highest frequency element is : "+minEle+" with Frequency "+minFreq);

    }
}
