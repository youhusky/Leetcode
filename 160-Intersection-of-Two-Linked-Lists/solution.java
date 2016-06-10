/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA, currB = headB;
        int lenA = 0, lenB = 0;
        while  (currA!= null){
            currA = currA.next;
            lenA++;
        }
        while (currB != null){
            currB = currB.next;
            lenB++;
        }
        currA = headA;
        currB = headB;
        // use two points the longer Linked list should go first
        //1. 得到2个链条的长度。

// 2. 将长的链条向前移动差值（len1 - len2）

// 3. 两个指针一起前进，遇到相同的即是交点，如果没找到，返回null.
        if (lenA < lenB){
            for (int i=0; i< lenB-lenA; i++)
                currB = currB.next;
        }
        else{
            for (int i=0; i< lenA-lenB; i++)
                currA = currA.next;
        }
        
        while (currA!= currB) // the node of next and val should be same
            {
                currA = currA.next;
                currB = currB.next;
            }
        
        return currA; 
    }
}