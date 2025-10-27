import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class pascals_row {
    public static List<Long> getPascalRow(int n){
        List<Long> row = new ArrayList<>();
        long value =1;
        row.add(value);
        for(int k=1;k<n;k++){
            value = value *(n-k)/k;
            row.add(value);
        }
        return row;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number (n): ");
        int n = sc.nextInt();
        List<Long> pascalRow = getPascalRow(n);
        System.out.println("The " + n + "th row of Pascal's Triangle is: " + pascalRow);
        sc.close();
    }
}
