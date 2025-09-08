import java.util.ArrayList;
import java.util.Scanner;
public class union_two_sorted_arrays {
    public static ArrayList<Integer> findUnion(int arr1[],int arr2[],int n1,int n2){
        // Brute Force using HashSet
        // HashMap <Integer,Integer> freq = new HashMap<>();
        // ArrayList <Integer> Union = new ArrayList<>();
        // for(int i=0;i<n1;i++){
        //     freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
        // }
        // for(int i=0;i<n2;i++){
        //     freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
        // }
        // for(int it:freq.keySet()){
        //     Union.add(it);
        // }
        // return Union;
        // Optimal Approach using two pointers
        ArrayList <Integer> Union = new ArrayList<>();
        int i=0,j=0;
        while(i<n1  && j<n2){
            if(arr1[i]<=arr2[j]){
                if(Union.isEmpty()|| Union.get(Union.size()-1)!=arr1[i]){
                    Union.add(arr1[i]);
                }i++;
            }else{
                if(Union.isEmpty()|| Union.get(Union.size()-1)!=arr2[j]){
                    Union.add(arr2[j]);
                }j++;
            }
        }
        while(i<n1){
            if( Union.get(Union.size()-1)!=arr1[i]){
                    Union.add(arr1[i]);
                }i++;
        }
        while(j<n2){
            if(Union.get(Union.size()-1)!=arr2[j]){
                    Union.add(arr2[j]);
                }j++;
        }
        return Union;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array:");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter the elements of first array:");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter size of second array:");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter the elements of second array:");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        ArrayList<Integer> Union = findUnion(arr1,arr2,n1,n2);
        System.out.println("Union of two arrays is:");
        for(int i=0;i<Union.size();i++){
            System.out.print(Union.get(i)+" ");
        }

    }
}
