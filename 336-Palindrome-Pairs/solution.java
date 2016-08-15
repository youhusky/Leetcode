public class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> ret = new ArrayList<>(); 
        if (words == null || words.length < 2) return ret;
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<words.length; i++) map.put(words[i], i);
        for (int i=0; i<words.length; i++) {
            for (int j=0; j<=words[i].length(); j++) { // notice it should be "j <= words[i].length()"
                String str1 = words[i].substring(0, j);
                String str2 = words[i].substring(j);
                if (isPalindrome(str1)) {
                    String str2rvs = new StringBuilder(str2).reverse().toString();
                    if (map.getOrDefault(str2rvs, i) != i) ret.add(Arrays.asList(map.get(str2rvs), i));
                }
                if (isPalindrome(str2) && str2.length() != 0) {
                    String str1rvs = new StringBuilder(str1).reverse().toString();
                    // check "str.length() != 0" to avoid duplicates
                    if (map.getOrDefault(str1rvs, i) != i) ret.add(Arrays.asList(i, map.get(str1rvs)));
                }
            }
        }
        return ret;
    }
    private boolean isPalindrome(String str) {
        for (int l = 0, r = str.length() - 1; l <= r; l ++, r --) 
            if (str.charAt(l) != str.charAt(r)) return false;
        return true;
    }
}