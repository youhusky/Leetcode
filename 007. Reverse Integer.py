'''
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
'''
class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if abs(x) > 2147483647:
            return 0
        else:
            if x < 0:
                flag = -1
            else:
                flag = 1
        number_str = str(abs(x))
        r = number_str[::-1]
        if abs(int(r)) > 2147483647:
            return 0
        return flag*int(r)
        