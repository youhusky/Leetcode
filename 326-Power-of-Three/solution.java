public class Solution {
    public boolean isPowerOfThree(int n) {
        //without any loop
        //use log 3^5 3^1    log(3^5)/log(3^1) == int
        return ((Math.log10(n) / Math.log10(3)) % 1 == 0);
    }
}