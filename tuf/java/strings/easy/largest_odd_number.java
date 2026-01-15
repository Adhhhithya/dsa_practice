import java.util.*;
public class largest_odd_number {
        public static String largestOddNumber(String num) {
        int j=-1;
        int i;
        for(i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2==1){
                j=i;
                break;
            }
        }
        if(j==-1) return "";
        i=0;
        while(i<=j && num.charAt(i)=='0') i++;

        return num.substring(i,j+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numeric string: ");
        String num = sc.nextLine();
        String result = largestOddNumber(num);
        System.out.println("The largest odd number substring is: " + result);
        sc.close();
    }
}