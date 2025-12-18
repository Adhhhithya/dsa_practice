
import java.util.*;

public class asteroid_collision {
    private int[] asteroidCollision(int asteroids[]){
        int n = asteroids.length;
        List<Integer> st = new ArrayList<>();
        for(int i=0;i<n;i++){
            int curr = asteroids[i];
            if(curr > 0){
                st.add(curr);
            }else{
                while(!st.isEmpty() && st.get(st.size()-1) >0 && st.get(st.size()-1)<Math.abs(curr)){
                    st.remove(st.size()-1);
                }

                if(!st.isEmpty() && st.get(st.size()-1)==Math.abs(curr)){
                    st.remove(st.size()-1);
                }else if(st.isEmpty() || st.get(st.size()-1)<0){
                    st.add(curr);
                }
            }
        }
        int result[] = new int[st.size()];
        for(int i=0;i<st.size();i++){
            result[i] = st.get(i);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int asteroids[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            asteroids[i]=sc.nextInt();
        }
        asteroid_collision obj = new asteroid_collision();
        int result[] = obj.asteroidCollision(asteroids);
        System.out.println("The state of asteroids after all collisions is: " + Arrays.toString(result));
        sc.close();
    }
}
