public class Solution {
    //State: f[i][j] is max length of matrix until (i, j);
    //Function: f[i][j] = min(f[i - 1][j - 1], f[i][j - 1], f[i - 1][j]) + 1 if matrix[i - 1][j - 1] == '1';
    //Initialize: f[0][0] = 0;
    //Result: f[matrix.length][matrix[0].length];
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int m = matrix.length, n = matrix[0].length;
        int[][] f = new int[m + 1][n + 1];
        int max = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    f[i][j] = Math.min(f[i - 1][j - 1], Math.min(f[i][j - 1], f[i - 1][j])) + 1;
                    max = Math.max(max, f[i][j]);
                }
            }
        }
        
        return max * max;
    }
}