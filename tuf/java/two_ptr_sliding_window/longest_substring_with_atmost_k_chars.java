import java.util.*;
public class longest_substring_with_atmost_k_chars {
    public static int longest_substring(String s,int k){
        int l=0,r=0,maxlen=-0;
        HashMap<Character,Integer> mpp = new HashMap<>();

        while(r < s.length()){
            char c = s.charAt(r);
            mpp.put(c,mpp.getOrDefault(c, 0)+1);

            while(mpp.size()>k){
                char left = s.charAt(l);
                mpp.put(left,mpp.get(left)-1);
                if(mpp.get(left)==0){
                    mpp.remove(left);
                }
                l = l+1;
            }
            if(mpp.size()<=k){
                maxlen = Math.max(maxlen,r-l+1);
            }
            r = r+1;
        }
        return maxlen;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k :");
        int k = sc.nextInt();
        System.out.println("Enter the string :");
        String s = sc.next();
        System.out.println("The longest substring with atmost k distinct characters is :");
        System.out.println(longest_substring(s,k));
        sc.close();
    }
}
