import java.util.Scanner;
public class basic_hash {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of array elements: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //precompute hash array
        int [] hash = new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }

        System.out.print("Enter no. of queries : ");
        int q=sc.nextInt();
        while(q>0){
            //fetch
            System.out.println("Enter a number for query :");
            int num = sc.nextInt();
            System.out.println("The number "+num+" is present "+hash[num]+" times in the array");
            q-=1;
        }
    }
}
