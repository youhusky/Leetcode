/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)  return head;
        ListNode start = head;
        while (start.next!= null){
            if (start.val == start.next.val)
            start.next = start.next.next;
            else
                start = start.next;
        }
    return head;
    }
}