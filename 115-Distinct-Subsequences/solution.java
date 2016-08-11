public class Solution {
    public int numDistinct(String S, String T) {
        if (T.length() == 0) return 1;
        int rows = S.length() + 1, cols = T.length() + 1;
        int[][] dp = new int[rows][cols];
        dp[0][0] = 1;
        for (int i = 1; i < rows; i++) {
            dp[i][0] = 1;
            for (int j = 1; j < cols; j++) {
                if (S.charAt(i - 1) == T.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[rows - 1][cols - 1];
    }
}