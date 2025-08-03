// Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the Reverse N-Number Triangle.

// Example:
// Input: ‘N’ = 3

// Output: 

// 1 2 3
// 1 2
// 1

public class Solution_6 {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<= n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}