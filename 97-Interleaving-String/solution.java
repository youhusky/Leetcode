public class Solution {
public boolean isInterleave(String s1, String s2, String s3) {
    if (s1.length() + s2.length() != s3.length()) {
        return false;
    }
    boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
    dp[0][0] = true;
    for (int i = 0; i < s1.length(); i++) {
        if (s1.charAt(i) == s3.charAt(i) && dp[i][0] == true) {
            dp[i + 1][0] = true;
        }
    }
    for (int j = 0; j < s2.length(); j++) {
        if (s2.charAt(j) == s3.charAt(j) && dp[0][j] == true) {
            dp[0][j + 1] = true;
        }
    }
    for (int i = 1; i <= s1.length(); i++) {
        for (int j = 1; j <= s2.length(); j++) {
            if (s3.charAt(i + j - 1) == s1.charAt(i - 1) && dp[i - 1][j] == true) {
                dp[i][j] = true;
            }
            if (s3.charAt(i + j - 1) == s2.charAt(j - 1) && dp[i][j - 1] == true) {
                dp[i][j] = true;
            }
        }
    }
    return dp[s1.length()][s2.length()];
}
}