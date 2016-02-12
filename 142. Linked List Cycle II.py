'''
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Note: Do not modify the linked list.
'''
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        fast = slow = head
        cir = 0
        while fast and fast.next:
            if not fast.next:
                return None
            fast = fast.next.next
            slow = slow.next
            if fast is slow:
                cir =1
                break
        if cir == 0:
            return None
        
        slow = head
        while slow!=fast:
            fast = fast.next
            slow = slow.next
        return slow
            