'''
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
'''
class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        _list = []
        for i in range(numRows):
            _list.append([1] * (i + 1))
            if i > 1:
                for j in range(1,i):
                    _list[i][j] = _list[i-1][j-1] + _list[i-1][j]
        return _list
                
        