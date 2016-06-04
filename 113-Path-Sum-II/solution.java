/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList();
        findPath(root, sum, path, ans);
        return ans;
    }

    private void findPath(TreeNode r, int target, List<Integer> path, List<List<Integer>> ans) {
        if (r == null ) return;
        path.add(r.val);
        if (r.left == null && r.right == null && r.val == target) ans.add(new ArrayList<Integer>(path));
        if (r.right != null) findPath(r.right, target - r.val, path, ans);
        if (r.left != null) findPath(r.left, target - r.val, path, ans);
        path.remove(path.size() - 1);
    }
}