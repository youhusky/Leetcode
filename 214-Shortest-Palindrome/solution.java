public class Solution {
    public String shortestPalindrome(String s) {
        // 将字符串反转后拼接到后面
        String rev = (new StringBuilder(s)).reverse().toString();
        String combine = s + "#" + rev;
        // 计算LPS表值
        int[] lps = new int[combine.length()];
        getLPS(combine, lps);
        int remove = lps[lps.length-1];
        // 去掉后缀后，将反转字符串拼回前面
        String prepend = rev.substring(0, rev.length() - remove);
        return prepend + s;
    }
    
    private void getLPS(String s, int[] lps){
        // i是后缀末尾的指针，j是前缀末尾的指针
        int j = 0, i = 1;
        lps[0] = 0;
        // 从j=0，i=1开始找，错开了一位
        while(i < s.length()){
            // 如果字母相等，则继续匹配，最长相同前后缀的长度也加1
            if(s.charAt(i) == s.charAt(j)){
                lps[i] = j + 1;
                i++;
                j++;
            // 如果不同
            } else {
                // 如果前缀末尾指针还没退回0点，则找上一个子前缀的末尾位置
                if(j != 0){
                    j = lps[j - 1];
                // 如果退回0点，则最长相同前后缀的长度就是0了
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}
