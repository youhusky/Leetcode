public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //sliding window
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            // move window 0~10 k==5
            //when i == 6 and still no duplicate then the first one is meaningless
             if(!set.add(nums[i])) return true;
        }
        return false;
    }
}