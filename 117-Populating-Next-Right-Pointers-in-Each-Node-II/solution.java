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
        if (root == null)   return;
        TreeLinkNode p = root;
        TreeLinkNode first = null;
        TreeLinkNode last = null;
        
        while (p != null){
            if (first == null){// set next level node
                if (p.left != null){
                    first = p.left;
                }
                else if (p.right != null){
                    first = p.right;
                }
            }
            
            if(p.left != null){
                if(last != null){
                    last.next = p.left;
                }
                last = p.left;//now node
            }
            if(p.right != null){
                if (last != null){
                    last.next = p.right;
                }
                last = p.right;
            }
            
            if (p.next != null){
                p = p.next;
            }
            else{
                p = first;
                last = null;
                first = null;
            }
        }
    }
}