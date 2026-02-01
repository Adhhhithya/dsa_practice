import java.util.*;
public class set_sun_bun{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long low =0;
    long high =(long) 2e9;
    long ans =0;
    if(n>=k){
      System.out.println(0);
      return;
    }
    while(low<=high){
      long mid = (low+high)/2;
      long sum = (mid+1)*(2*n+mid)/2;
      if(sum>=k){
        ans = mid;
        high = mid -1;
      }else{
        low = mid+1;
      }
    }
    System.out.println(ans);
    sc.close();
    
  }
}