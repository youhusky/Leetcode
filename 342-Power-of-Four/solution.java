public class Solution {
    public boolean isPowerOfFour(int num) {
        // method 1 log
        //return (num > 0 && (Math.log10(num) / Math.log10(4)) % 1 == 0);
        
        // method 2 bit
        // 1 on the odd location 4 - 100
        // 1   0 0000 0001
        // 4   0 0000 0100
        // 16  0 0001 0000
        // 64  0 0100 0000
        // 256 1 0000 0000
        // 0x55555555   10101010101010101
        return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) == num;

    }
}