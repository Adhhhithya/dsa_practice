import java.util.*;
public class reverse_string {
    public static ArrayList<Character> reverse(ArrayList<Character> s){
        int left =0;
        int right = s.size()-1;
        reverse(s,left,right);
        return s;
    }
    private static void reverse(ArrayList<Character> s,int left,int right){
        if(left>=right) return;
        char temp = s.get(left);
        s.set(left,s.get(right));
        s.set(right,temp);
        reverse(s,left+1,right-1);
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        ArrayList<Character> s = new ArrayList<>();
        for(char c : str.toCharArray()){
            s.add(c);
        }
        System.out.println("Reversed string is "+reverse(s));
        sc.close();
    }

}
