import java.util.*;
public class word_search {
    public static boolean exist(char[][] board, String word){
        for(int i=0; i< board.length;i++){
            for(int j=0; j< board[0].length; j++){
                if(board[i][j]==word.charAt(0)){
                    if(solve(0,i,j,board,word)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean solve(int ind, int i, int j, char[][] board, String word){
        if(ind==word.length()) return true;
        if(i<0 || j<0 || i>= board.length || j>= board[0].length || board[i][j]!=word.charAt(ind)){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = ' ';
        boolean ans = solve(ind+1,i+1,j,board,word) ||
                        solve(ind+1,i-1,j,board,word) ||
                        solve(ind+1,i,j+1,board,word) ||
                        solve(ind+1,i,j-1,board,word);
        board[i][j] = temp;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int n = sc.nextInt();
        char[][] board = new char[m][n];
        System.out.println("Enter the board:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                board[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println("Enter the word to search:");
        String word = sc.next();
        boolean res = exist(board,word);
        if(res){
            System.out.println("Word exists in the board.");
        } else {
            System.out.println("Word does not exist in the board.");
        }
        sc.close();
    }
}