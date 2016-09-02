public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3)    return 0;
        Arrays.sort(nums);
        int closesum = 0, minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++){
            int left = i + 1, right = nums.length -1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);
                if (diff < minDiff){
                    minDiff = diff;
                    closesum = sum;
                }
                if (sum < target){
                    left ++;
                }
                else if (sum > target){
                    right--;
                }
                else{
                    return sum;
                }
            }
        }
        return closesum;
        
    }
}