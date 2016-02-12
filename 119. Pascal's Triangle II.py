'''
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

'''
class Solution(object):
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        res = [1 for _ in xrange(rowIndex+1)]
        for i in xrange(2, rowIndex+1):
            pre = res[0]
            for j in xrange(1, i):
            	#print j
                cur = res[j]
                res[j] += pre
                pre = cur
        return res
        