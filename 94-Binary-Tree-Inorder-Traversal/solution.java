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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        helper(root, res);
        return res;
    }
    private void helper(TreeNode root, ArrayList<Integer> res){
        if (root == null)
            return;
        helper(root.left, res);
        res.add(root.val);
        helper(root.right, res);
    }
}