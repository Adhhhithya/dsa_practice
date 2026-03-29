import java.util.Scanner;
public class illegal {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    if(n%5==0){
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }
    sc.close();
  }  
}
