import java.util.*;
public class longest_palindromic_substring {
    private static int[] expand(String s , int left,int right){
        while(left>=0 && right< s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return new int[]{left+1,right-1};
    }

    public static String longest_palindrome(String s){
        int n = s.length();
        if(n==0) return "";
        int start =0, end =0;
        for(int i=0;i<n;i++){
            int[] odd = expand(s,i,i);
            int[] even = expand(s,i,i+1);
            if(odd[1]-odd[0]>end-start){
                start = odd[0];
                end = odd[1];
            }
            if(even[1]-even[0]>end -start){
                start = even[0];
                end = even[1];
            }
        }
        return s.substring(start,end+1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Longest palindromic substring: " + longest_palindrome(s));
        sc.close();
    }
    
}
