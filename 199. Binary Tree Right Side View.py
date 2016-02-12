'''
Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

For example:
Given the following binary tree,
   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
You should return [1, 3, 4].
'''
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def rightSideView(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        res,stack = [],[(root,0)]
        while stack:
            curr,level = stack.pop()
            if curr:
                if len(res) < level + 1:
                    res.append([])
                res[level].append(curr.val)
                stack.append((curr.right, level + 1))
                stack.append((curr.left, level + 1))
        return [i[-1] for i in res]
        