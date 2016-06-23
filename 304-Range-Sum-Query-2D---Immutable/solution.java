public class NumMatrix {
    int[][] res;
    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        for(int i = 0; i < matrix.length; i++){
            for (int j = 1; j < matrix[i].length;j++){
                matrix[i][j] += matrix[i][j-1]; 
            }
        }
        this.res = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int result = 0;
        for (int i = row1; i<=row2; i++){
         if(col1 == 0){
             result += res[i][col2];
         }
         else{
            result += res[i][col2] - res[i][col1-1];
            
            }
        }
        return result;
    }
}


// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.sumRegion(1, 2, 3, 4);