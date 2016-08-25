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
    public TreeNode sortedArrayToBST(int[] A) {  
        return helper(0, A.length - 1, A);
    }  
    public TreeNode helper(int start, int end, int[]A) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(A[mid]);
        root.left = helper(start, mid - 1, A);
        root.right = helper(mid + 1, end, A);
        return root;
    }
}