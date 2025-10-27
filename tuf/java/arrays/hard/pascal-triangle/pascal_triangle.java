import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class pascal_triangle {
    public static List<List<Long>> generatePascalTriangle(int numRows){
        List<List<Long>> triangle = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Long> row = new ArrayList<>(Collections.nCopies(i + 1, 1L));
            for(int j=1;j<i;j++){
                row.set(j,triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
            }
            triangle.add(row);

        }
        return triangle;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = sc.nextInt();
        List<List<Long>> pascalTriangle = generatePascalTriangle(numRows);
        System.out.println("Pascal's Triangle with " + numRows + " rows:");
        for (List<Long> row : pascalTriangle) {
            System.out.println(row);
        }
        sc.close();
    }
}
