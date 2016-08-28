public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        for (int i = 1; i <= len; i++){
            for (int j = 0; j < i; j++){
                if (dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i] = true;//from 0~i word
                    break;
                }
            }
        }
        return dp[len];
    }
}