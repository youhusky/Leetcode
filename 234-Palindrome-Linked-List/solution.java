/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    //1->2->3->4
    ListNode reverse(ListNode head) {
    ListNode prev = null;
    while(head!=null) {
        ListNode tmp = head.next;   //tmp:2 3
        head.next = prev;   //1->null   2->1
        prev = head;        //prev:1    2
        head = tmp;         //head:2    3
    }
    return prev;
}

public boolean isPalindrome(ListNode head) {
    if (head==null) return true;

    //Find middle node: use slow, fast pointers.
    ListNode fast = head.next;
    ListNode mid = head;
    while(fast !=null && fast.next != null) {
        fast = fast.next.next;
        mid = mid.next;
    }

    //Reverse: mid..end
    ListNode tail = reverse(mid);

    //Compare tail to mid and start to mid.
    while (tail !=null && head != null) {
        if (tail.val != head.val) {
            return false;
        }
        tail = tail.next;
        head = head.next;
    }
    return true;
}
}