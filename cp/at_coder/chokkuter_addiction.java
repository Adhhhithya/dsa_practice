import java.util.*;
public class chokkuter_addiction{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int T = sc.nextInt();
    long open_time = 0;
    long total =0;
    for(int i=0;i<n;i++){
      long ai = sc.nextInt();
      
      if(ai > open_time){
        total += ai-open_time;
        open_time = ai+100;
      }
    }
    if(open_time < T){
      total += T-open_time;
    }
    System.out.println(total);
    sc.close();
  }
}