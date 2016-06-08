/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // two points
        ListNode fast = head;
        ListNode slow = head;
        
        for (int i =0; i<n; i++){
            fast = fast.next;
        }
        //if remove the first node
        if (fast == null){
            head = head.next;
            return head;
        }
        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
        
    }
}