public class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix.length == 0) return;
        boolean firstRowZero = false, firstColZero = false;
        // 记录哪些行哪些列需要置0，并判断首行首列是否需要置0
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i != 0 && j != 0 && matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                } else if (matrix[i][j] == 0){
                    // 如果首行或首列出现0，则标记其需要置0，否则沿用上次值
                    firstRowZero = i == 0 ? true : firstRowZero;
                    firstColZero = j == 0 ? true : firstColZero;
                }
            }
        }//imp!
        // 将除首行首列的位置置0
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        // 如果必要，将首列置0
        for(int i = 0; firstColZero && i < matrix.length; i++){
            matrix[i][0] = 0;
        }
        // 如果必要，将首行置0
        for(int j = 0; firstRowZero && j < matrix[0].length; j++){
            matrix[0][j] = 0;
        }
    }
}
