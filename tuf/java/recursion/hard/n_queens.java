import java.util.*;
public class n_queens {
    public List<List<String>> solve_n_queen(int n){
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();
        String str = ".".repeat(n);
        for(int i=0;i<n;i++){
            board.add(str);
        }
        helper(0,board,ans,n);
        return ans;
    }

    private static void helper(int row, List<String> board, List<List<String>> ans, int n){
        if(row==n){
            ans.add(new ArrayList<>(board));
            return;
        }

        for(int col=0;col<n;col++){
            if(placing_possible(row,col,board)){
                char[] rowArr = board.get(row).toCharArray();
                rowArr[col] ='Q';
                board.set(row, new String(rowArr));

                helper(row+1,board,ans,n);

                rowArr[col]='.';
                board.set(row, new String(rowArr));
            }
        }
    }

    private static boolean placing_possible(int row, int col, List<String> board){
        int r = row;
        int c = col;

        while(r>=0){
            if(board.get(r).charAt(c)=='Q') return false;
            r--;
        }
        r=row;

        while(r>=0 && c>=0){
            if(board.get(r).charAt(c)=='Q') return false;
            r--;
            c--;
        }

        r=row;
        c=col;

        while(r>=0 && c< board.get(0).length()){
            if(board.get(r).charAt(c)=='Q') return false;
            r--;
            c++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queens:");
        int n = sc.nextInt();
        n_queens nq = new n_queens();
        List<List<String>> res = nq.solve_n_queen(n);
        System.out.println("Solutions for " + n + " queens:");
        for(List<String> solution : res){
            for(String row : solution){
                System.out.println(row);
            }
            System.out.println();
        }
        sc.close();
    }
}
