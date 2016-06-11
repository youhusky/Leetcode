/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k<1)    return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy, prev = dummy;
        
        while (p!= null){
            prev = p;
            for (int i=0;i<k;i++){
                p = p.next;
                if (p == null)  return dummy.next;//到这里已经不够k个没法翻转了
            }
            p = reverse (prev, p.next);
            
        }
        return dummy.next;
        
    }
    //reverse function
    private ListNode reverse(ListNode prev, ListNode end){
        ListNode temp = prev.next;
        while (temp.next != end){
            ListNode n = temp.next;
            temp.next = n.next;
            n.next = prev.next;
            prev.next = n;
        }
        return temp;
    }
}