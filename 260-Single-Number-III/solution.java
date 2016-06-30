public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0; i < nums.length; ++i)
           xor ^= nums[i];
        int result[] = new int[2];
        xor = xor & (-1 * xor);//找最后一位1
        for(int i = 0; i < nums.length; ++i)
            if((nums[i] & xor) != 0)
                result[0] ^= nums[i];
            else
                result[1] ^= nums[i];
        return result;
    }
}