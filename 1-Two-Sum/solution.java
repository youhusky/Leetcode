public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i =0; i< nums.length;i++){
            if (map.containsKey(target - nums[i])){
                res[1] = i;
                res[0] = map.get(target - nums[i])-1;
                return res;
            }
            map.put(nums[i], i+1);
        }
        return res;
    }
}