public class Solution {
public List<List<Integer>> combinationSum(int[] nums, int target) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, target, 0);
    return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
    if(remain < 0) return;
    else if(remain == 0) list.add(new ArrayList<>(tempList));
    else{ 
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
            tempList.remove(tempList.size() - 1);
           
        }
    }
}
}
// [2, 2, 2, 2]
// [2, 2, 2, 3]
// [2, 2, 2, 6]
// [2, 2, 2, 7]
// [2, 2, 2]
// [2, 2, 3]
// [2, 2, 6]
// [2, 2, 7]
// [2, 2]
// [2, 3, 3]
// [2, 3, 6]
// [2, 3, 7]
// [2, 3]
// [2, 6]
// [2, 7]
// [2]
// [3, 3, 3]
// [3, 3, 6]
// [3, 3, 7]
// [3, 3]
// [3, 6]
// [3, 7]
// [3]
// [6, 6]
// [6, 7]
// [6]
// [7]
