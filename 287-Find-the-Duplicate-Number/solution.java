public class Solution {
    public int findDuplicate(int[] nums) {
        int low = 1, high = nums.length -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            int cnt=0;
            for (int i:nums){
                if (i <= mid){
                    cnt = cnt + 1;
                }
            }
            if (cnt <= mid){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
            System.out.println(mid);
        }
        return low;
    }
}