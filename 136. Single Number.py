'''
Given an array of integers, every element appears twice except for one. Find that single one.
'''
class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = nums[0]
        for i in range(1,len(nums)):
            ans = ans ^ nums[i]
        return ans
        