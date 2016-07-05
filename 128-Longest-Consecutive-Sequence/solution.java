public class Solution {
    public int longestConsecutive(int[] num) {
        HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
        int length = num.length, max = 0;
        for (int n : num) {
            visited.put(n, false);
        }
        for (int i = 0; i < num.length; i++) {
            int n = num[i];
            if (visited.get(n)) {
                continue;
            }
            int count = 1;
            for (int left = n - 1; left >= n - length + 1; left--) {
                if (visited.containsKey(left)) {
                    visited.put(left, true);
                    count++;
                } else {
                    break;
                }
            }
            for (int right = n + 1; right <= n + length - 1; right++) {
                if (visited.containsKey(right)) {
                    visited.put(right, true);
                    count++;
                } else {
                    break;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}