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
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }
    private boolean isValid(TreeNode node, Integer max, Integer min){
        if (node == null)
            return true;
        if(min !=null && node.val<= min)
            return false;
        if(max != null && node.val>= max)
            return false;
        // pass the value
        return isValid(node.left, node.val, min) && isValid(node.right, max, node.val);
    }
}