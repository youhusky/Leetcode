public class Solution {
    public boolean isScramble(String s1, String s2) {

        if (s1.equals(s2))
            return true;

        char[] s1chars = s1.toCharArray();
        char[] s2chars = s2.toCharArray();
        Arrays.sort(s1chars);
        Arrays.sort(s2chars);
        for (int i = 0; i < s1chars.length; i++) {
            if (s1chars[i] != s2chars[i])
                return false;
        }

        int half = 1;
        boolean result = false;
        while (half < s1.length()) {
            result = (isScramble(s1.substring(0, half), s2.substring(0, half))
                    && isScramble(s1.substring(half, s1.length()), s2.substring(half, s2.length())))
                    || (isScramble(s1.substring(0, half), s2.substring(s2.length() - half, s2.length()))
                    && isScramble(s1.substring(half, s1.length()), s2.substring(0, s2.length() - half)));
            if (result)
                break;
            half++;
        }

        return result;
    }
}