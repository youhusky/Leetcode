/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode BST(ListNode head, ListNode tail) {
        ListNode slow = head, fast = head;
        if (head == tail) return null;
        
        //这里是fast不能等于tail,也省去了把listnode从中间分隔时，需要添加null的麻烦！
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        TreeNode root = new TreeNode(slow.val);
        root.left = BST(head, slow);
        root.right = BST(slow.next, tail);
        return root;
    }
    
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return BST(head, null);
    }
}