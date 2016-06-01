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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        else    return isSymmetricSubtree(root.left, root.right);
    }
    private boolean isSymmetricSubtree(TreeNode left, TreeNode right){
        if (left == null && right == null)
            return true;
        else if (left == null || right == null)
            return false;
        else if (left.val == right.val)
            return isSymmetricSubtree(left.left, right.right) && isSymmetricSubtree(left.right, right.left);
        return false;
    }
}