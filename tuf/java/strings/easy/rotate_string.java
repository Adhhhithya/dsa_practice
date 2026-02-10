import java.util.*;
public class rotate_string {
    public static boolean rotateString(String s , String goal){
        if(s.length()!=goal.length()) return false;
        String doubled = s+s;
        return doubled.contains(goal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String s = sc.nextLine();
        System.out.print("Enter the goal string: ");
        String goal = sc.nextLine();
        boolean result = rotateString(s, goal);
        if(result){
            System.out.println("The string '" + goal + "' is a rotation of '" + s + "'.");
        } else {
            System.out.println("The string '" + goal + "' is not a rotation of '" + s + "'.");
        }
        sc.close();
    }
}
