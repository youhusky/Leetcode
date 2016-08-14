public class Solution {
    public void rotate(int[][] matrix) {
        // 计算圈数
        int n = matrix.length, lvl = n / 2;
        for(int i = 0; i < lvl; i++){
            for(int j = i; j < n - i - 1; j++){
                // 左上和左下交换
                swap(matrix, i, j, j, n - i - 1);
                // 左上和右下交换
                swap(matrix, i, j, n - i - 1, n - j - 1);
                // 左上和右上交换
                swap(matrix, i, j, n - j - 1, i);
            }
        }
    }
    private void swap(int[][] matrix, int i1, int j1, int i2, int j2){
        int tmp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = tmp;
    }
}