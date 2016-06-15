public class Solution {
    public boolean isPowerOfFour(int num) {
        return (num > 0 && (Math.log10(num) / Math.log10(4)) % 1 == 0);
    }
}