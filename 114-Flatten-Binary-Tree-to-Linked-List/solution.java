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
    public void flatten(TreeNode root) {
    if (root == null) {
        return;
    }
    TreeNode[] list = new TreeNode[1];
    helper(list, root);
}
public void helper(TreeNode[] list, TreeNode root) {
    if (root == null) {
        return;
    }
    TreeNode right = root.right;
    if (list[0] != null) {
        list[0].right = root;
        list[0].left = null;
    }
    list[0] = root;
    helper(list, root.left);
    helper(list, right);
}
}