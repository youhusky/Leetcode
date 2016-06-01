public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0; i< nums.length; i++){
            if (i != 0 && nums[i] == nums[i-1]) continue; // i< nums.length -1 -> [0,0,0] error
            int left = i+1;
            int right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;
                    res.add(Arrays.asList(nums[i], nums[left++], nums[right--])); // add the result and add its value
                }
                else if(sum<0) left++;
                else if(sum>0) right--;
            }
        }
        return res;
    }
}