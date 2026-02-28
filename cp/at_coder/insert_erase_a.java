import java.util.*;
public class insert_erase_a {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        List<Integer> gapsS = new ArrayList<>();
        List<Integer> gapsT = new ArrayList<>();
        StringBuilder skeletonS = new StringBuilder();
        StringBuilder skeletonT = new StringBuilder();

        // Step 1: Process both strings
        processString(s, gapsS, skeletonS);
        processString(t, gapsT, skeletonT);

        // Step 2: Validation (If the pillars don't match, it's impossible)
        if (!skeletonS.toString().equals(skeletonT.toString())) {
            System.out.println("-1");
            sc.close();
            return;
        }

        // Step 3: Calculation
        // The number of gaps will always be skeleton.length() + 1
        long totalOperations = 0;
        for (int i = 0; i < gapsS.size(); i++) {
            // Calculate how many A's need to be added or removed in this specific gap
            totalOperations += Math.abs(gapsS.get(i) - gapsT.get(i));
        }

        System.out.println(totalOperations);
        sc.close();
    }

    public static void processString(String str, List<Integer> gaps, StringBuilder skeleton) {
        int countA = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'A') {
                countA++;
            } else {
                skeleton.append(c);
                gaps.add(countA); // Marbles before this pillar
                countA = 0;       // Reset marble count for the next gap
            }
        }
        gaps.add(countA); // Marbles after the final pillar
    }
}
