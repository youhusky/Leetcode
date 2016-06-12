public class Solution {
    public void moveZeroes(int[] nums) {
        // Shift non-zero values as far forward as possible
        // Fill remaining space with zeros
        if (nums == null || nums.length == 1){
            return;
        }
        int insert = 0;
        for (int num: nums){
            if (num != 0){
                nums[insert] = num;
                insert++;
            }
        }
        while (insert < nums.length){
            nums[insert] = 0;
            insert++;
        }
    }
}