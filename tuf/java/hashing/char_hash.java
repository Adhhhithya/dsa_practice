import java.util.Scanner;
public class char_hash {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.next();

        // precompute hash
        int [] hash = new int[256];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }

        System.out.print("Enter no. of queries :");
        int q = sc.nextInt();
        while(q>0){
            System.out.print("Enter the character to find :");
            char c = sc.next().charAt(0);
            //fetch
            System.out.println("The character "+c+" appears "+hash[c-'a']+" times");
            q--;
        }
    }
}
