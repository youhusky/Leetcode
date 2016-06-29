public class Solution {
    public int search(int[] nums, int target) {
    if(nums == null || nums.length == 0) return -1;

    int left = 0, right = nums.length-1;
    while(left <= right){
        int mid = left + (right - left)/2;
        if(nums[mid] == target) return mid;                //find target
        if(nums[mid] >= nums[left]){                    
            if(target >= nums[left] && target < nums[mid]) right = mid - 1;
            else left = mid + 1;
        }
        else{
            if(target > nums[mid] && target <= nums[right]) left = mid + 1;
            else right = mid - 1;
        }
    }
    return -1;
    }
}