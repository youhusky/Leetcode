public class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 0) return 0;
		int n = nums.length;
		int ans = 1;
		for (int i = 1, j = 0; i < n; j = i,i++) {
			if (nums[j] < nums[i]) {
				ans++;
				while (i + 1 < n && nums[i] <= nums[i + 1]) i++;
			}
			else if (nums[j] > nums[i]) {
				ans++;
				while (i + 1 < n && nums[i] >= nums[i + 1]) i++;
			}
		}
		return ans;
    }
}