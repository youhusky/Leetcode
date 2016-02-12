'''
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.

Hint:

How many majority elements could it possibly have?
Do you have a better hint? Suggest it!
'''
class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        dic = {}
        res = []
        for num in nums:
            if num not in dic:
                dic[num] = 1
            else:
                dic[num] +=1
            if dic[num] > len(nums) /3:
                res.append(num)
        return list(set(res))
        