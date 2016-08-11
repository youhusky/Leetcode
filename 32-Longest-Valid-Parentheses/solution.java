public class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> left = new Stack<Integer>();
        int max = 0, matchBegin = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                left.push(i);
            } else {
                if (left.isEmpty()) {
                    matchBegin = i + 1;
                } else {
                    left.pop();
                    if (left.isEmpty()) {
                        max = Math.max(max, i - matchBegin + 1);
                    } else {
                        max = Math.max(max, i - left.peek());
                    }
                }
            }
        }
        return max;
    }
}