/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null)   return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = dummy;
        for (int i = 1; i< m; i++){
            node = node.next;
        }
        ListNode temp = node.next;
        for (int i = m; i < n; i++){
            ListNode tmv = temp.next;
            temp.next = tmv.next;
            tmv.next = node.next;
            node.next = tmv;
        }
        return dummy.next;
    }
}