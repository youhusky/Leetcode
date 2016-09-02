public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        if (nums.length < 3)
            return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++){
            int left = i + 1, right = nums.length - 1;
            if (i!=0 && nums[i] == nums[i-1])
                continue;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    ArrayList<Integer> temp = new ArrayList();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    res.add(temp);
                    left ++;
                    right --;
                    //avoid duplicate
                    while(left < right && nums[left] == nums[left - 1])
                        left ++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                }
                else if (sum < 0){
                    left ++;
                }
                else{
                    right --;
                }
            }
        }
        return res;
    }
}