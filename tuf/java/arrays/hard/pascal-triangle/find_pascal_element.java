import java.util.Scanner;
public class find_pascal_element {
    public static int pascal_element(int r,int c){
        int n = r-1;
        int k = c-1;
        long result =1;
        for(int i=0;i<k;i++){
            result = result *(n-i);
            result = result /(i+1);
        }
        return (int)result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number (r): ");
        int r = sc.nextInt();
        System.out.print("Enter the column number (c): ");
        int c = sc.nextInt();
        int element = pascal_element(r,c);
        System.out.println("Element at row " + r + " and column " + c + " in Pascal's Triangle is: " + element);
        sc.close();
    }
}
