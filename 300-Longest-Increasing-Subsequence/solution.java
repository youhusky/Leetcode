public class Solution {
    public int lengthOfLIS(int[] nums) {
    if(nums == null || nums.length == 0) {
        return 0;
    }
    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    int len = 0;
    for(int i = 1; i < nums.length; i++) {
        if(nums[i] > dp[len]) {
            dp[++len] = nums[i];
        }
        else {
            int index = search(dp, len, nums[i]);
            dp[index] = nums[i];
        }
    }
    return len + 1;
}

private int search(int[] dp, int len, int val) {
    int start = 0;
    while(start <= len) {
        int mid = start + (len - start) / 2;
        if(dp[mid] == val) {
            return mid;
        }
        else if(dp[mid] < val) {
            start = mid + 1;
        }
        else {
            len = mid - 1;
        }
    }
    return start;
}
}