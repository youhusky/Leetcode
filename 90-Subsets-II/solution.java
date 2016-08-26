public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        if (nums == null || nums.length == 0)   return res;
        List<Integer> curr = new ArrayList();
        Arrays.sort(nums);
        dfs(nums, curr, res, 0);
        return res;
    }
    private void dfs(int[] nums, List<Integer> curr, List<List<Integer>> res, int index){
        if (!res.contains(curr)){
        res.add(new ArrayList(curr));
        }// add[]
        for (int i = index; i < nums.length; i++){
            curr.add(nums[i]);
            dfs(nums, curr, res, i + 1);
            curr.remove(curr.size()-1);//1-2-3    1 3
        }
    }
}
