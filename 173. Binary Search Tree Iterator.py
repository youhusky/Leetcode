'''
Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
'''
# Definition for a  binary tree node
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class BSTIterator(object):
    def __init__(self, root):
        """
        :type root: TreeNode
        """
        self.stack = list()
        self.pushAll(root)
        

    def hasNext(self):
        """
        :rtype: bool
        """
        return self.stack
        

    def next(self):
        """
        :rtype: int
        """
        tmp = self.stack.pop()
        self.pushAll(tmp.right)
        return tmp.val
    def pushAll(self, node):
        while node is not None:
            self.stack.append(node)
            node = node.left
        

# Your BSTIterator will be called like this:
# i, v = BSTIterator(root), []
# while i.hasNext(): v.append(i.next())