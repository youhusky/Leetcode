'''
Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.
'''
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        length = 0
        node = head
        while node:
            length+=1
            node = node.next
        if length == 0:
            return None
        if k % length == 0:
            return head
            
        fast =  slow = head
        k %= length
        while k:
            fast = fast.next
            k -= 1
        while fast and fast.next:
            fast= fast.next
            slow = slow.next
        fast.next = head
        head = slow.next
        slow.next = None
        return head
       
        