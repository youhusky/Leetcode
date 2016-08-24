public class Solution {
    public int DP(int i, int j, int[] nums, int[][] dp) {
        if (dp[i][j] > 0) return dp[i][j];
        for (int x = i; x <= j; x++) {
            dp[i][j] = Math.max(dp[i][j], DP(i, x - 1, nums, dp) + nums[i - 1] * nums[x] * nums[j + 1] + DP(x + 1, j, nums, dp));
        }
        return dp[i][j];
    }

    public int maxCoins(int[] iNums) {
        int n = iNums.length;
        int[] nums = new int[n + 2];
        for (int i = 0; i < n; i++) nums[i + 1] = iNums[i];
        nums[0] = nums[n + 1] = 1;
        int[][] dp = new int[n + 2][n + 2];
        return DP(1, n, nums, dp);
    }
}