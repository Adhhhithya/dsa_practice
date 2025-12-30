import java.util.*;
public class maximal_rectangle {
    public static int max_area_rectangle(int heights[]){
        int n = heights.length;
        int max_area = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&& heights[st.peek()]>heights[i]){
                int el = st.peek();
                st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                max_area = Math.max(max_area, heights[el]*(nse-pse-1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int el = st.peek();
            st.pop();
            int nse = n;
            int pse = st.isEmpty() ? -1 : st.peek();
            max_area = Math.max(max_area, heights[el]*(nse-pse-1));
        }
        return max_area;
    }
    public static int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        if(n==0) return 0;
        int m = matrix[0].length;
        int maxArea =0;
        int pre_sum[][] = new int[n][m];
        for(int j =0;j<m;j++){
            int sum =0;
            for(int i=0;i<n;i++){
                if(matrix[i][j]=='1'){
                    sum+=1;
                }else{
                    sum=0;
                }
                pre_sum[i][j]=sum;
            }
        }
        for(int i=0;i<n;i++){
            maxArea = Math.max(maxArea,max_area_rectangle(pre_sum[i]));
        }
        return maxArea;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter number of columns:");
        int m = sc.nextInt();
        char matrix[][] = new char[n][m];
        System.out.println("Enter the matrix row-wise (only '0' and '1'):");
        for(int i=0;i<n;i++){
            String row = sc.next();
            for(int j=0;j<m;j++){
                matrix[i][j] = row.charAt(j);
            }
        }
        int result = maximalRectangle(matrix);
        System.out.println("The area of the largest rectangle containing only 1's is: " + result);
        sc.close();
    }
}
