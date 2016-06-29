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
    public int countNodes(TreeNode root) {
    if (root == null) {
        return 0;
    }
    int l = leftHeight(root.left);
    int r = leftHeight(root.right);
    if (l == r) { // left side is full
        return countNodes(root.right) + (1<<l);
    } 
    return countNodes(root.left) + (1<<r);
}

private int leftHeight(TreeNode node) {
    int h = 0;
    while (node != null) {
        h++;
        node = node.left;
    }
    return h;
}
}