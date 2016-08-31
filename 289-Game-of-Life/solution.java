public class Solution {
    //00 dead -> dead
    //10 dead -> live
    //01 live -> dead
    //11 live -> live
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        if (rows == 0) 
            return;
        int cols = board[0].length;
        
        // 定义邻居的方向
        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // 记录活邻居的数量
                int liveCount = 0;
                for (int k = 0; k < dirs.length; k++) {
                    int x = i + dirs[k][0];
                    int y = j + dirs[k][1];
                    if (x >= 0 && x < rows && y >= 0 && y < cols) {
                        // 根据低位数字得到旧状态
                        if (board[x][y] % 2 == 1) 
                            liveCount++;
                    }
                }
                
                if (board[i][j] % 2 == 1) {
                    if (liveCount == 2 || liveCount == 3) 
                        board[i][j] += 2;
                } else {
                    if (liveCount == 3) 
                        board[i][j] += 2;
                }
            }
        }
        
        // 根据高位更新矩阵到最新状态
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] >>= 1;
            }
        }
    }
}