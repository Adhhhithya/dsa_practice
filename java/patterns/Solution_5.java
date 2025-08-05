// Sam is planting trees on the upper half region (separated by the left diagonal) of the square shared field.

// For every value of ‘N’, print the field if the trees are represented by ‘*’.

// Example:
// Input: ‘N’ = 3

// Output: 
// * * *
// * *
// *

public class Solution_5 {

    // Method to print the seed pattern
    public static void seeding(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Main method to run the code in VS Code
    public static void main(String[] args) {
        int number = 5; // change this value to test with different input
        seeding(number);
    }
}
