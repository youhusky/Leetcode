/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)  return; //void not return anything
        ListNode fast = head, slow = head;
        
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = slow.next; // new fast
        slow.next = null;// cut the linked list 
        
       //reverse second half of the list
       ListNode cur = fast;
       ListNode pre = fast.next;
       
       cur.next = null;
       
       while (pre != null){
           ListNode temp = pre.next;
           pre.next = cur;
           cur = pre;
           pre = temp;// interesting save the third node
       }
       //merge the list
       ListNode first = head;
       ListNode second = cur;
       while (second != null && first != null && first!= second){
           //1-3-5   2-4-6
           ListNode temp = second.next;
           second.next = first.next;
           first.next = second;
           first = second.next;//3
           second = temp;
       }
       
    }
}