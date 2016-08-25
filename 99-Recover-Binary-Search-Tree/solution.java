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
    private TreeNode wrongLargeNode;
    private TreeNode wrongLessNode;
    private TreeNode preNode;
    
    public void recoverTree(TreeNode root) {
        recover(root);
        if(wrongLargeNode != null && wrongLessNode != null){
            int temp = wrongLargeNode.val;
            wrongLargeNode.val = wrongLessNode.val;
            wrongLessNode.val = temp;
        }
    }
    public void recover(TreeNode root){
        if (root == null) return;
        if (preNode == null && root.left == null)
            preNode = root;
            //inorder search
        recover(root.left);
        if(preNode != null && root.val < preNode.val){
            if(wrongLessNode == null){
                wrongLessNode = preNode;
                wrongLargeNode = root;
            }
            else{
                wrongLargeNode = root;
                return;
            }
        }
        preNode = root;
        recover(root.right);
    }
}