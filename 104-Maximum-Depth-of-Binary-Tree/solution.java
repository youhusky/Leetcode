/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //Traverse
public class Solution {
    private int depth;
    public int maxDepth(TreeNode root) {
        if (root ==null)
            return 0;
        depth = 0;
        dfs(root,1);
        return depth;
    }
    private void dfs(TreeNode root, int curr){
        if (root == null){
            return;
        }
        if (depth < curr)
            depth = curr;
        dfs(root.left, curr + 1);
        dfs(root.right, curr + 1);
    }
}