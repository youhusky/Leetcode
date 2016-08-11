public class Solution {
    public int maxProduct(int[] nums) {
       
        if (nums.length == 1) {
            return nums[0];
        }
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            max[i] = min[i] = nums[i];
        }
        int product = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                max[i] = Math.max(min[i - 1] * nums[i], max[i]); 
                min[i] = Math.min(max[i - 1] * nums[i], min[i]);
                product = Math.max(max[i], product);
            } else {
                max[i] = Math.max(max[i], max[i - 1] * nums[i]);
                min[i] = Math.min(min[i], min[i - 1] * nums[i]);
                product = Math.max(max[i], product);
            }
        }
        return product;
    }
}