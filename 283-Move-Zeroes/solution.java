public class Solution {
    public void moveZeroes(int[] nums) {
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