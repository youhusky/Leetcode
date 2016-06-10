/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        int n = 1;
        ListNode node = head;
        while(node.next != null)  {  //get the length of the linked list
            node = node.next;
            n++;
        }
        node.next = head;// circle
        k = n - k%n;
        
        for (int i =0; i< k; i++){
            node = node.next;
        }
        head = node.next;
        node.next = null;
        return head;
        
    }
}