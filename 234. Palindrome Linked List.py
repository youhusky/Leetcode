'''
Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
'''
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        ## cannot duplicate linkedlist
        if not head:
            return True
        fast = slow = head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
        
        newHead = None
        while slow:
            nodenext = slow.next
            slow.next = newHead #to new
            newHead = slow
            slow = nodenext
        while newHead:
            if newHead.val!= head.val:
                return False
            newHead = newHead.next
            head = head.next
        return True
            
        
        