/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
    //  //保存p3
    // n = p2->next;
    // //将p3的next挂载到p2后面
    // p2->next = p3->next;
    // //将p3挂载到p1的后面
    // p1->next = p3;
    // //将p2挂载到p3得后面
    // p3->next = p2;
//  对于上题，我们首先遍历得到第m - 1个node，也就是pm的前驱节点。然后依次遍历，处理挂载问题就可以了。
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
            node.next = tmv;//1->
        }
        return dummy.next;
    }
}