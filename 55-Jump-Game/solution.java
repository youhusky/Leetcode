public class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        int i=0;
        while(max<nums.length-1){
            if(i>max) return false;
            max=Math.max(max, i+nums[i]);
            i++;
        }
        return true;
    }
}