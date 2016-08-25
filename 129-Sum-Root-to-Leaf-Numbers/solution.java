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
    
    int sum = 0;
    
    public int sumNumbers(TreeNode root) {
        if(root != null) getSum(root);
        return sum;
    }
    
    private void getSum(TreeNode n){
        if(n.left == null && n.right == null){
            sum += n.val;
        }
        if(n.left != null){
            n.left.val += n.val * 10;
            getSum(n.left);
        }
        if(n.right != null){
            n.right.val += n.val * 10;
            getSum(n.right);
        }
    }
}