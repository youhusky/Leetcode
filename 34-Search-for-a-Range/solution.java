public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int left = 0, right = nums.length-1,rightBoundry = nums.length-1;
        while (left < right){
            int mid = (right +left)/2;
            if (nums[mid] < target) {
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        //左边界 left==right
        if(target != nums[left]){
            return res;
        }
        
        while (right < rightBoundry){
            int mid = 1 + (rightBoundry + right) / 2;
            if (nums[mid] > target){
                rightBoundry = mid - 1;
                
            }
            else {
                right = mid;
            }
        }
        res[0] = left;
        res[1] = right;
        return res;
    }
}