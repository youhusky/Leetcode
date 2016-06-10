/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        //1->2->3->4
        //2->1->4->3
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode current = dummy;
    while (current.next != null && current.next.next != null) {
        ListNode first = current.next;  //1 3
        ListNode second = current.next.next;    //2 4
        first.next = second.next;   //1->3  3->5
        current.next = second;  //->2   1->4
        current.next.next = first;  //2->1  2->1->4->3
        current = current.next.next;    //curr: 1
    }
    return dummy.next;
    }
}