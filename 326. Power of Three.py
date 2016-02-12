'''
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?
'''
class Solution(object):
    import math
    def isPowerOfThree(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n <= 0:
            return False
        x = math.log(n,3)
        return abs(round(x) - x) < 0.000000000001
        