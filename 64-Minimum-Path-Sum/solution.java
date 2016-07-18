public class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = grid;
        int m = grid.length;
        int n = grid[0].length;
        
        for(int i=1;i<m;i++){
            dp[i][0] = dp[i-1][0] + grid[i][0]; // 初始化第一行
        }
        
        for(int i=1;i<n;i++){
            dp[0][i] = dp[0][i-1] + grid[0][i]; // 初始化第一列
        }
        
        for(int i=1;i<m;i++){ // 除去第一行
            for(int j=1;j<n;j++){ // 除去第一列
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j]; // 遍历选择最小的
            }
        }
        return dp[m-1][n-1];
    }
}