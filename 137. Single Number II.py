'''
Given an array of integers, every element appears three times except for one. Find that single one.
'''
class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        dic = {}
        for i in nums:
            if i not in dic:
                dic[i] = 1
            else:
                dic[i] += 1
        return sorted(dic.iteritems(), key = lambda d:d[1])[0][0]
        