public class Solution {
    public boolean exist(char[][] board, String word) {
    if (word == null || word.length() == 0) {
        return true;
    }
    if (board == null || board.length == 0 || board[0].length == 0) {
        return false;
    }
    boolean[][] visit = new boolean[board.length][board[0].length];
    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
           if ( helper(board, visit, word, i, j, 0)) {
               return true;
           }
        }
    }
    return false;
}
public boolean helper(char[][] board, boolean[][] visit, String word, int i, int j, int pos) {
    if (pos == word.length()) {
        return true;
    }
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visit[i][j] || board[i][j] != word.charAt(pos)) {
        return false;
    }
    //board[i][j] != word.charAt(pos)!!!
    visit[i][j] = true;
    boolean res = helper(board, visit, word, i + 1, j, pos + 1) || helper(board, visit, word, i - 1, j, pos + 1) || helper(board, visit, word, i , j - 1, pos + 1) || helper(board, visit, word, i, j + 1, pos + 1);
    visit[i][j] = false;
    return res;
}
}