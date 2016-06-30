public class Solution {
    public List<String> summaryRanges(int[] nums) {
         int min;
        List<String> ls = new ArrayList<String>();

        if(nums.length > 0) {
            min = nums[0];
            for (int i = 0; i < nums.length;i++) {
                if ((i+1 < nums.length) && (Math.abs(nums[i] - nums[i+1]) == 1)) {
                    continue;
                } else {
                    if(min == nums[i]) 
                            ls.add(nums[i]+"");
                    else 
                        ls.add(min+"->"+nums[i]);
                    if(i+1 < nums.length) 
                        min = nums[i+1];
                }
            }
        }
        return ls;
    }
}