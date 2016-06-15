public class Solution {
    public String convertToTitle(int n) {
        // //recursive method      27 -- 1 (0 + 'A')+ 'A'
        // if (n == 0) return "";
        // return convertToTitle((n - 1) / 26) + (char) ((n - 1) % 26 + 'A');
        StringBuilder res = new StringBuilder();
        while (n > 0){
            n--;
            res.insert(0,(char) (n % 26 + 'A'));
            n /= 26;
        }
        return res.toString();
    }
}