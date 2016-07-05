public class Solution {
    public String countAndSay(int n) {
        if (n == 0) return "";
        if (n == 1) return "1";
        String s = countAndSay(n-1);
        char ch = s.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ch) count++;
            else {
                sb.append(count);
                sb.append(ch);
                count = 1;
                ch = s.charAt(i);
            }
        }
        sb.append(count);
        sb.append(ch);
        return sb.toString();
    }
}