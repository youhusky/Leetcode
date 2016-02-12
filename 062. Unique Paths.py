'''
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?


Above is a 3 x 7 grid. How many possible unique paths are there?

'''
class Solution(object):
    def uniquePaths(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        if not m or not n:
            return 0
        dp = [[1 for _ in xrange(n)] for _ in xrange(m)]
        for i in xrange(1,m):
            for j in xrange(1,n):
                dp[i][j] = dp[i-1][j] + dp[i][j-1]
        return dp[-1][-1]
        