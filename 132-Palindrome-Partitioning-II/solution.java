public class Solution {

    public int minCut(String s) {
        int length = s.length();
        boolean[][] isPalindrome = new boolean[length][length];
        int[] numOfCuts = new int[length + 1];
        numOfCuts[0] = -1;
        for (int i = 1; i < length + 1; i++) {
            numOfCuts[i] = numOfCuts[i - 1] + 1;
        }
        for (int end = 0; end < length; end++) {
            for (int begin = end; begin >= 0; begin--) {
                if (s.charAt(begin) == s.charAt(end) && (end - begin < 2 || isPalindrome[begin + 1][end - 1])) {
                    isPalindrome[begin][end] = true;
                    numOfCuts[end + 1] = Math.min(numOfCuts[end + 1], numOfCuts[begin] + 1);
                }
            }
        }
        return numOfCuts[numOfCuts.length - 1];
    }
}
