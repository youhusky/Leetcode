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
    public int minDepth(TreeNode root) {
        if(!root)
            return 0;
        if(!root.left)
            return minDepth(root.right)+1;
        if(!root.right)
            return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right))+1;
    }
}