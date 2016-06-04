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
    private List<List<Integer>> result = new ArrayList<List<Integer>>();

public List<List<Integer>> pathSum(TreeNode root, int sum) {
    helper(new ArrayList<Integer>(), root, sum);
    return result;
}

private void helper(List<Integer> list, TreeNode root, int sum) {
    if (root == null) return;
    list.add(root.val);
    sum -= root.val;
    if (root.left == null && root.right == null) {
        if (sum == 0) result.add(list);
        return;
    }
    helper(new ArrayList<Integer>(list), root.left, sum);
    helper(new ArrayList<Integer>(list), root.right, sum);
}
}