/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {////用一个dummy节点来当做head的prev
        if (head == null || head.next == null)   return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy, curr = head;
        while (curr != null && curr.next != null){////如果没有重复，则prev为p，next为p->next
            if (curr.val != curr.next.val){
            prev = curr;
            curr = curr.next;
            }
            else{
            int tempval = curr.val;
            ListNode temp = curr.next.next;
            while(temp!=null){
                if (temp.val != tempval)    break;////如果有重复，则继续遍历，直到不重复的节点
                else    temp = temp.next;
                }
            prev.next = temp;// //删除重复节点
            curr = temp;
            }   
        }
    return dummy.next;
    }
    
}