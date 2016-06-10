/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//  这题要求我们対链表进行切分，使得左半部分所有节点的值小于x，而右半部分大于等于x。

// 我们可以使用两个链表，p1和p2，以此遍历原链表，如果节点的值小于x，就挂载到p1下面，反之则放到p2下面，最后将p2挂载到p1下面就成了。
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0), dummy2 = new ListNode(0); //new ListNode(0)
        ListNode node = head;
        ListNode end1 = dummy1, end2 =dummy2; 
        while (node != null){
            if (node.val<x){
                dummy1.next = node;
                dummy1 = dummy1.next;
            }
            else{
                dummy2.next = node;
                dummy2 = dummy2.next;
            }
            node = node.next;
        }
        dummy2.next = null;
        dummy1.next = end2.next;
        return end1.next;
    }
}