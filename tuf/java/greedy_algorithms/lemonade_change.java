import java.util.*;
public class lemonade_change {
    public static boolean can_provide_change(int bills[]){
        int five=0,ten=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five++;
            }else if(bills[i]==10){
                if(five>0){
                    ten++;
                    five--;
                }else{
                    return false;
                }
            }else{
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }else if(five>=3){
                    five -=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customers :");
        int n = sc.nextInt();
        int bills[] = new int[n];
        System.out.println("Enter the bills paid by each customer :");
        for(int i=0;i<n;i++){
            bills[i] = sc.nextInt();
        }
        System.out.println("Can we provide change to all customers ? :");
        System.out.println(can_provide_change(bills));
        sc.close();
    }
}
