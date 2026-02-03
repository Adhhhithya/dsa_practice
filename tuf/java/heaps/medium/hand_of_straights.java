import java.util.*;
public class hand_of_straights {
    public static boolean is_n_straight_hand(int hand[],int group_size){
        if(hand.length % group_size !=0) return false;

        TreeMap<Integer,Integer> freq = new TreeMap<>();

        for(int card : hand){
            freq.put(card,freq.getOrDefault(card,0)+1);
        }

        while(!freq.isEmpty()){
            int start = freq.firstKey();
            int count = freq.get(start);

            for(int i=0;i<group_size;i++){
                int card = start +i;
                if(!freq.containsKey(card)||freq.get(card)<count){
                    return false;
                }
                if(freq.get(card)==count){
                    freq.remove(card);
                }else{
                    freq.put(card,freq.get(card)-count);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cards in hand: ");
        int n = sc.nextInt();
        int[] hand = new int[n];
        System.out.println("Enter the cards : ");
        for(int i=0;i<n;i++){
            hand[i] = sc.nextInt();
        }
        System.out.print("Enter the group size: ");
        int group_size = sc.nextInt();
        boolean result = is_n_straight_hand(hand, group_size);
        if(result){
            System.out.println("The hand can be rearranged into groups of " + group_size + " consecutive cards.");
        }else{
            System.out.println("The hand cannot be rearranged into groups of " + group_size + " consecutive cards.");
        }
        sc.close();
    }
}
