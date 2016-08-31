public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(1, k, n, new ArrayList<Integer>());
        return res;
    }
    public void helper(int start, int count, int target, List<Integer> pre) {
        if (count == 0) {
            if (target == 0) res.add(pre);
            else return;
        }
        else {
            if (target <= 0) return;
            if (target > 0) {
                for (int i = start; i <= 9; i++) {
                    List<Integer> cur = new ArrayList<Integer> (pre);
                    cur.add(i);
                    helper(i+1, count-1, target-i, cur);
                }
            }
        }
    }
}