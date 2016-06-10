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
        
        if (lenA < lenB){
            for (int i=0; i< lenB-lenA; i++)
                currB = currB.next;
        }
        else{
            for (int i=0; i< lenA-lenB; i++)
                currA = currA.next;
        }
        
        while (currA!= currB)
            {
                currA = currA.next;
                currB = currB.next;
            }
        
        return currA; 
    }
}