/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null){
            return;
        }
        TreeLinkNode p = root;
        TreeLinkNode first = null;
        
        while (p != null){
            if (first == null){
                first = p.left;//next level left child
            }
            //如果有左子树，那么next就是父节点
            if(p.left != null){
                p.left.next = p.right;//2->3
            }
            else{
                break;
            }
            
            if (p.next != null){
                p.right.next = p.next.left;//如果有next，那么设置右子树的next
                p = p.next;
                continue;
            }
            else{
                p = first;
                first = null;
            }
        }
        
    }
}