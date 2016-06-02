public class Solution {
    public boolean isValidSudoku(char[][] board) {
    Set seen = new HashSet();
    for (int i=0; i<9; i+=1) {
        for (int j=0; j<9; j+=1) {
            char number = board[i][j];
            if (number != '.')
                if (!seen.add(number + " in row " + i) ||
                    !seen.add(number + " in column " + j) ||
                    !seen.add(number + " in block " + i/3 + "-" + j/3))
                    //add return true if doesn't contain item
                    return false;
        }
    }
    return true;
    }
}