public class Solution {
    public List<String> wordBreak(String s, Set<String> wordDict) {
        // 判断是否能够分解
        if (!helper(s, wordDict)) {
            return new ArrayList<String>();
        }
        
        // 记录字符串s.substring(0, i)对应的解
        HashMap<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        map.put(0, new ArrayList<>());
        map.get(0).add("");
        
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (map.containsKey(j) && wordDict.contains(s.substring(j, i))) {
                    if (!map.containsKey(i))
                        map.put(i, new ArrayList<>());
                    for (String str : map.get(j)) {
                        map.get(i).add(str + (str.equals("") ? "" : " ") + s.substring(j, i));
                    }
                }
            }
        }
        
        return map.get(s.length());
    }
    
    private boolean helper(String s, Set<String> wordDict) {
        boolean dp[] = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }
}