public class Solution {
    public boolean isPowerOfTwo(int n) {
        // 4 -- 100     3 -- 011    4 & 3 == 0 bit add
        return (n > 0 && (n & (n - 1)) == 0);
    }
}