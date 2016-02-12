'''
Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,

    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.
'''
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sumNumbers(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root:
            return 0
        sum = 0
        # down 10^
        stack = [(root,root.val)]
        while stack:
            node,val = stack.pop()
            if not node.left and not node.right:
                sum +=val
            if node.left:
                stack.append((node.left, val*10 + node.left.val))
            if node.right:
                stack.append((node.right, val*10 + node.right.val))
        return sum
            
        